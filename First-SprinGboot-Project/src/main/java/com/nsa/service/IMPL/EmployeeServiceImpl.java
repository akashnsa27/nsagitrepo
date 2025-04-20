package com.nsa.service.IMPL;

import com.nsa.ExceptionHandler.NotFoundException;
import com.nsa.entity.Employee;
import com.nsa.repository.EmployeeRepository;
import com.nsa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository empRepo; // new Impl

    @Override
    public String saveEmployee(Employee emp) {
        Employee save = empRepo.save(emp);
        return "Employee saved";
    }

    @Override
    public Employee getEmployeeById(int id) {
        Optional<Employee> optionalEmp = empRepo.findById(id);

        if (optionalEmp.isPresent()) {
            Employee emp = optionalEmp.get();
            return emp;
        } else {
            throw new NotFoundException("Employee does not exists for id : " + id) ;
        }
    }

    @Override
    public String updateEmployee(Employee emp) {

//        Optional<Employee> byId = empRepo.findById(emp.getId());

        Employee existingEmp = empRepo.findById(emp.getId()).orElseThrow(() -> {
            throw new NotFoundException("Employee does not exists for id : " + emp.getId());
        });
        existingEmp.setDepartment(emp.getDepartment());
        existingEmp.setName(emp.getName());

        if(emp.getSalary() > 50000){
            throw new IllegalArgumentException("Salary can not exceed 50000");
        }

        existingEmp.setSalary(emp.getSalary());
        empRepo.save(existingEmp);
        return "Employee updated";
    }

    @Override
    public String updateEmployeeSalary(int id, Long salary) {

        Employee existingEmp = empRepo.findById(id).get();
        existingEmp.setSalary(salary);
        empRepo.save(existingEmp);

        return "Employee updated with salary : " + salary;
    }


    @Override
    public void deleteEmployeeById(int id) {
        empRepo.deleteById(id);
    }
}
