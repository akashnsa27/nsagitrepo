package com.nsa.controller;

import com.nsa.entity.Employee;
import com.nsa.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employee")
@RequiredArgsConstructor
@Slf4j
public class EmployeeController {

    //constructor based DI
    private final EmployeeService empService;  //new EmployeeServiceImpl


    @PostMapping("/save")
    public ResponseEntity<String> saveEmpData(@RequestBody Employee emp) {
        String msg = empService.saveEmployee(emp);


        return new ResponseEntity<>(msg, HttpStatus.CREATED);
    }

    @GetMapping("/{empId}") //http://localhost:8080/api/v1/employee/1
    public ResponseEntity<Employee> getEmpByIdPath(@PathVariable("empId") int id) {

        log.info("employee id {}", id);
        Employee emp = empService.getEmployeeById(id);
        return ResponseEntity.ok(emp);
    }

    @GetMapping  //http://localhost:8080/api/v1/employee?id=1
    public ResponseEntity<Employee> getEmpByIdRequest(@RequestParam int id) {
        Employee emp = empService.getEmployeeById(id);

        if (emp != null) {
            return new ResponseEntity<>(emp, HttpStatusCode.valueOf(200));
        } else {

            log.error("Employee not exists for ID : {}", id);
            return new ResponseEntity<>(emp, HttpStatusCode.valueOf(404));
        }

    }

    @PutMapping("/update")
    public ResponseEntity<String> updateEmployee(@RequestBody Employee emp) {

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(empService.updateEmployee(emp));
    }

    @PatchMapping("/{id}")
    public String updateEmpSalary(@PathVariable("id") int id,
                                  @RequestParam Long salary
    ) {
        return empService.updateEmployeeSalary(id, salary);
    }

    @DeleteMapping("/{id}")
    public void deleteEmp(@PathVariable("id") int id) {
        empService.deleteEmployeeById(id);
    }

}
