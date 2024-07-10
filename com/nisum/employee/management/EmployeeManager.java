package com.nisum.employee.management;

import java.util.*;

public class EmployeeManager {
    private Map<Integer, Employee> employees;

    public EmployeeManager() {
        employees = new HashMap<>();
    }

    // Add a new employee
    public void addEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    // Remove an employee by ID
    public void removeEmployeeById(int id) {
        employees.remove(id);
    }

    // Update an employee's salary by ID
    public void updateEmployeeSalary(int id, double newSalary) {
        if (employees.containsKey(id)) {
            employees.get(id).setSalary(newSalary);
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    // Retrieve all employees in a specific department
    public List<Employee> getEmployeesByDepartment(String department) {
        List<Employee> departmentEmployees = new ArrayList<>();
        for (Employee employee : employees.values()) {
            if (employee.getDepartment().equalsIgnoreCase(department)) {
                departmentEmployees.add(employee);
            }
        }
        return departmentEmployees;
    }

    // Retrieve the employee with the highest salary
    public Employee getEmployeeWithHighestSalary() {
        if (employees.isEmpty()) {
            return null;
        }

        Employee highestSalaryEmployee = null;
        double maxSalary = Double.MIN_VALUE;

        for (Employee employee : employees.values()) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                highestSalaryEmployee = employee;
            }
        }

        return highestSalaryEmployee;
    }

    // Utility method to print all employees (for testing purposes)
    public void printAllEmployees() {
        for (Employee employee : employees.values()) {
            System.out.println(employee);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        // Adding employees
        manager.addEmployee(new Employee(1, "John Doe", "Engineering", 60000));
        manager.addEmployee(new Employee(2, "Jane Smith", "HR", 55000));
        manager.addEmployee(new Employee(3, "Michael Johnson", "Engineering", 62000));
        manager.addEmployee(new Employee(4, "Emily Davis", "Finance", 58000));

        // Printing all employees
        manager.printAllEmployees();

        // Removing an employee
        manager.removeEmployeeById(4);

        // Printing all employees after removal
        System.out.println("\nEmployees after removal:");
        manager.printAllEmployees();

        // Updating an employee's salary
        manager.updateEmployeeSalary(3, 65000);

        // Printing all employees after salary update
        System.out.println("\nEmployees after salary update:");
        manager.printAllEmployees();

        // Retrieving all employees in a specific department
        System.out.println("\nEngineering department employees:");
        List<Employee> engineeringEmployees = manager.getEmployeesByDepartment("Engineering");
        for (Employee employee : engineeringEmployees) {
            System.out.println(employee);
        }

        // Retrieving the employee with the highest salary
        Employee highestSalaryEmployee = manager.getEmployeeWithHighestSalary();
        System.out.println("\nEmployee with highest salary:");
        System.out.println(highestSalaryEmployee);
    }
}
