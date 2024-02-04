package com.spring.datajpa.service;

import com.spring.datajpa.entity.Employee;
import com.spring.datajpa.entity.Project;
import com.spring.datajpa.repository.EmployeeRepository;
import com.spring.datajpa.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    ProjectRepository projectRepository;

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee assignEmployee(Long empId, Long projectId) {
        Set<Project> projectSet = null;
        Optional<Employee> emp = Optional.of(employeeRepository.findById(empId).get());
        Optional<Project> project = Optional.of(projectRepository.findById(projectId).get());
        if(emp.isPresent()) {
           projectSet =  emp.get().getAssignedProjects();
           if(project.isPresent()){
               projectSet.add(project.get());
               emp.get().setAssignedProjects(projectSet);
           }
        }
        return employeeRepository.save(emp.get());
    }
}
