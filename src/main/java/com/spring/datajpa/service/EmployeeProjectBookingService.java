package com.spring.datajpa.service;

import com.spring.datajpa.entity.Employee;
import com.spring.datajpa.entity.Project;
import com.spring.datajpa.exception.InvalidProjectException;
import com.spring.datajpa.model.BookingStatus;
import com.spring.datajpa.model.EmployeeProjectBooking;
import com.spring.datajpa.model.EmployeeProjectBookingAck;
import com.spring.datajpa.repository.EmployeeRepository;
import com.spring.datajpa.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class EmployeeProjectBookingService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    ProjectRepository projectRepository;

    @Transactional
    public EmployeeProjectBookingAck bookEmployeeProject(EmployeeProjectBooking employeeProjectBooking){

        Employee employee = employeeProjectBooking.getEmployee();
        Employee savedEmployee = employeeRepository.save(employee);

        Project project = employeeProjectBooking.getProject();
        if(validateProject(project)){
            Project savedProject = projectRepository.save(project);
        }else{
            throw new InvalidProjectException("Invalid Project mapped to Employee");
        }


        return new EmployeeProjectBookingAck(BookingStatus.SUCESS,savedEmployee);
    }

    private boolean validateProject(Project project) {

        return !project.getProjectName().contains("Invalid Project -") ? true : false;
    }
}
