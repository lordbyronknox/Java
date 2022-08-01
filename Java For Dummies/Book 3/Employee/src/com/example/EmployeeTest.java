
package com.example;

import com.example.domain.Employee;

public class EmployeeTest {
    
    
    public static void main(String[] args) {
        
        Employee employee = new Employee();
        
        employee.setEmployeeid(101);
        employee.setEmployeeName("Jane Smith");
        employee.setEmployeeSocialSecurityNumber("012_34_5678");
        employee.setEmployeeSalary(120_345.27);
        System.out.println(
                "\n Employee ID: " + employee.getEmployeeid() +
                "\n Employee Name: " + employee.getEmployeeName() +
                "\n Employee Ssn: " + employee.getEmployeeSocialSecurityNumber() +
                "\n Employee Salary: " + employee.getEmployeeSalary());
           
    }
}
