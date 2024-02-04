package com.spring.datajpa.model;

import com.spring.datajpa.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeProjectBookingAck {

    private BookingStatus bookedStatus;
    private Employee employee;

}
