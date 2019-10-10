package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public void run(String... strings) throws Exception{
        Department department;
        department = new Department("Human Resources");
        departmentRepository.save(department);

        department = new Department("Executives");
        departmentRepository.save(department);

        department = new Department("Information Technology");
        departmentRepository.save(department);

        department = new Department("Sales");
        departmentRepository.save(department);

        department = new Department("Advertising");
        departmentRepository.save(department);

        department = new Department("Administrative Support");
        departmentRepository.save(department);

        department = new Department("Accounting");
        departmentRepository.save(department);

        department = new Department("Mail Room");
        departmentRepository.save(department);

        department = new Department("Records");
        departmentRepository.save(department);

        department = new Department("Legal");
        departmentRepository.save(department);

        Department human_resources = departmentRepository.findByDepartmentNameEquals("Human Resources");
        Department executives = departmentRepository.findByDepartmentNameEquals("Executives");
        Department information_technology = departmentRepository.findByDepartmentNameEquals("Information Technology");
        Department sales = departmentRepository.findByDepartmentNameEquals("Sales");
        Department advertising = departmentRepository.findByDepartmentNameEquals("Advertising");
        Department administrative_support = departmentRepository.findByDepartmentNameEquals("Administrative Support");
        Department accounting = departmentRepository.findByDepartmentNameEquals("Accounting");
        Department mail_room = departmentRepository.findByDepartmentNameEquals("Mail Room");
        Department records = departmentRepository.findByDepartmentNameEquals("Records");
        Department legal = departmentRepository.findByDepartmentNameEquals("Legal");
        Employee employee;
        employee = new Employee("Jane","Williams",
                "123 Maple Street","Rockville","MD","20850",
                "Employee Specialist",human_resources);
        employeeRepository.save(employee);

        employee = new Employee("John","Munro",
                "127 Elm Street","Rockville","MD","20850",
                "Supervisor",mail_room);
        employeeRepository.save(employee);

        employee = new Employee("Pashma","Shah",
                "258 Cypress Lane","Bethesda","MD","20817",
                "Vice President, Operations",executives);
        employeeRepository.save(employee);

        employee = new Employee("Gorge","Chavez",
                "9874 Main Street","Silver Spring","MD","20808",
                "Help Desk Manager",information_technology);
        employeeRepository.save(employee);

        employee = new Employee("Bruce","Barnesworth",
                "2687 Magnolia Street","Gaithersburg","MD","20878",
                "Attorney",legal);
        employeeRepository.save(employee);

        employee = new Employee("Keneisha","Johnson",
                "1954 Beech Court","Rockville","MD","20850",
                "Director",sales);
        employeeRepository.save(employee);

        employee = new Employee("Victor","Deacon",
                "2345 Willow Way","Barnesville","MD","20888",
                "Physical Records Manager",records);
        employeeRepository.save(employee);

        employee = new Employee("Zelda","Fitzpatrick",
                "2222 Oak Street","North Bethesda","MD","20855",
                "Payroll Manager",accounting);
        employeeRepository.save(employee);

        employee = new Employee("Jewel","Akiba",
                "15 Palm Leaf Court","Rockville","MD","20850",
                "Secretary",administrative_support);
        employeeRepository.save(employee);

        employee = new Employee("Thomas","Green",
                "4477 Brown Street","Germantown","MD","20887",
                "Online Advertising Specialist",advertising);
        employeeRepository.save(employee);
    }

}
