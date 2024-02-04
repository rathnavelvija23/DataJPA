package com.spring.datajpa.controller;

import com.spring.datajpa.entity.Employee;
import com.spring.datajpa.model.EmployeeProjectBooking;
import com.spring.datajpa.model.EmployeeProjectBookingAck;
import com.spring.datajpa.service.EmployeeProjectBookingService;
import com.spring.datajpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableTransactionManagement
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    EmployeeProjectBookingService employeeProjectBookingService;

    @PostMapping("/createEmployee")
    public Employee createEmployee(@RequestBody  Employee employee){

        return employeeService.saveEmployee(employee);

    }

    @PutMapping("/employee/{empId}/project/{projectId}")
    public Employee assignProjectToEmployee(
            @PathVariable Long empId,
            @PathVariable Long projectId
            ){
        return employeeService.assignEmployee(empId,projectId);
    }

    @PostMapping("/employeeBooking")
    public EmployeeProjectBookingAck employeeProjectBookingAck(@RequestBody EmployeeProjectBooking employeeProjectBooking){
        return employeeProjectBookingService.bookEmployeeProject(employeeProjectBooking);
    }

}
