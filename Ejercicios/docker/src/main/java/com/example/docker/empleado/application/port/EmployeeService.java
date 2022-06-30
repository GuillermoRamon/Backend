package com.example.docker.empleado.application.port;

import com.example.docker.empleado.domain.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    void insertEmployee(Employee emp);

    void updateEmployee(Employee emp);

    void executeUpdateEmployee(Employee emp);

    public void deleteEmployee(Employee emp);
}
