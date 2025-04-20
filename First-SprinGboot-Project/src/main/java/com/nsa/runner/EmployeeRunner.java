package com.nsa.runner;

import com.nsa.entity.Employee;
import com.nsa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeRunner implements CommandLineRunner {

    @Autowired
    private EmployeeRepository empRepo;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("run method starts");

//        List<Employee> all = empRepo.findAll();
//        System.out.println(all);

//        boolean b = empRepo.existsById(10);// it will just check if object exist or not
//        System.out.println(b);
//        empRepo.findById(1);    // It will fetch actual object

//        List<Integer> idList = List.of(5,6,7);
//        List<Employee> allById = empRepo.findAllById(idList);
//        System.out.println(allById);

//        Employee referenceById = empRepo.getReferenceById(10);   //lazy loaded method
//        System.out.println(referenceById.getId());
//        System.out.println(referenceById.getName()); //

        List<Employee> employees = List.of(new Employee("xyz", "dev", 5000L),
                new Employee( "abc", "qa", 4000L),
                new Employee( "pqr", "rnd", 100L));

        empRepo.saveAll(employees);


    }
}
