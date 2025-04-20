package com.nsa.service;

import com.nsa.entity.Employee;

public interface EmployeeService {

    //CRUD :
    public String saveEmployee(Employee emp);

    public Employee getEmployeeById(int id);

    public String updateEmployee(Employee emp);

    public String updateEmployeeSalary(int id, Long salary);

    public void deleteEmployeeById(int id);
}
