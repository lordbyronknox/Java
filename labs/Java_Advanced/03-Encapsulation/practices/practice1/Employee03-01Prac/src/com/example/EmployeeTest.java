package com.example;


import com.example.domain.*;



public class EmployeeTest {

    public static void main(String[] args) {
      Engineer emp = new Engineer(101, "Jane Smith", "012_34_5678", 120_345.27);
      Manager man = new Manager(207, "Barabara Johnson", "054_12_2367", 109_501.36, "US Marketing");
      Admin adminOne = new Admin(304, "Bill Munroe", "108-23-6509", 75_002.34);
      Director boss = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, 
              "Global Marketing", 1_000_000.00);
      
//        emp.setEmpId(101);
//        emp.setName("Jane Smith");
//        emp.setSsn ("012-34-5678");
//        emp.setSalary(120_345.27);
        emp.printEmployee();
        man.printEmployee();
        adminOne.printEmployee();
        boss.printEmployee();
                
    }
}