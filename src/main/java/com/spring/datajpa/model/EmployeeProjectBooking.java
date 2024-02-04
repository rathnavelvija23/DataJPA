package com.spring.datajpa.model;

import com.spring.datajpa.entity.Employee;
import com.spring.datajpa.entity.Project;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeProjectBooking {

    private Employee employee;
    private Project project;

}
