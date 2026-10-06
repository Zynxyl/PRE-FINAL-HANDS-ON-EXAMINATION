/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carangueemployeepayroll;

/**
 *
 * @author User
 */
public class CarangueEmployeePayroll {

   public class Main {

        private static Employee fullTime;

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println("      DON JOSE ECLEO MEMORIAL COLLEGE");
        System.out.println("          EMPLOYEE PAYROLL SYSTEM");
        System.out.println("==================================================");

       

        // Create Part-Time Faculty object
        PartTimeFaculty partTime = new PartTimeFaculty(
                "PT001",
                "Juan Dela Cruz",
                "Information Technology",
                80,
                250.00
        );

        // Create Administrative Staff object
        AdminStaff admin = new AdminStaff(
                "AD001",
                "Ana Reyes",
                "Administration",
                25000.00,
                3000.00
        );

        // Employee array demonstrating polymorphism
        Employee[] employees = {
                fullTime,
                partTime,
                admin
        };

        // Display all employees
        for (Employee employee : employees) {

            System.out.println();
            System.out.println("--------------------------------------------------");

            // Display employee type
            if (employee instanceof FullTimeFaculty fullTimeFaculty) {
                fullTimeFaculty.displayFacultyType();
            } 
            else if (employee instanceof PartTimeFaculty partTimeFaculty) {
                partTimeFaculty.displayFacultyType();
            } 
            else if (employee instanceof AdminStaff adminStaff) {
                adminStaff.displayFacultyType();
            }

            // Method overloading
            employee.displayEmployeeInfo(true);
        }

        System.out.println();
        System.out.println("==================================================");
        System.out.println("Total Employees: " + Employee.getEmployeeCount());
        System.out.println("==================================================");
    }
    }
}

    

