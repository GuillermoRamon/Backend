package com.example.docker.empleado.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String employeeName;
    private String employeeId;
    private String employeeAddress;
    private String employeeEmail;
}
