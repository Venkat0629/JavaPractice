package assignment.design.patterns.structural;

import java.util.*;

interface Employee {
    void showDetails();
}

class Developer implements Employee {
    private String name;
    private String position;

    public Developer(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void showDetails() {
        System.out.println("Developer: [Name: " + name + ", Position: " + position + "]");
    }
}

class Manager implements Employee {
    private String name;
    private String position;
    private List<Employee> team = new ArrayList<>();

    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void addEmployee(Employee employee) {
        team.add(employee);
    }

    @Override
    public void showDetails() {
        System.out.println("Manager: [Name: " + name + ", Position: " + position + "]");
        System.out.println("Team:");
        for (Employee emp : team) {
            emp.showDetails();
        }
    }
}

public class CompositePattern {
    public static void main(String[] args) {
        Developer dev1 = new Developer("John", "Senior Developer");
        Developer dev2 = new Developer("David", "Junior Developer");

        Manager manager1 = new Manager("Jane", "Engineering Manager");
        manager1.addEmployee(dev1);
        manager1.addEmployee(dev2);

        Developer dev3 = new Developer("Emily", "Software Engineer");
        Developer dev4 = new Developer("Michael", "Intern");

        Manager manager2 = new Manager("Kate", "Project Manager");
        manager2.addEmployee(dev3);
        manager2.addEmployee(dev4);

        Manager headManager = new Manager("Mark", "Head of Engineering");
        headManager.addEmployee(manager1);
        headManager.addEmployee(manager2);

        System.out.println("Organizational Structure:");
        headManager.showDetails();
    }
}
