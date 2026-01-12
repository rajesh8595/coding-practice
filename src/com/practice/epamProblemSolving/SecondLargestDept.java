package com.practice.epamProblemSolving;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private  String empName;
    private String deptName;

    public Employee(String empName, String deptName) {
        this.empName = empName;
        this.deptName = deptName;
    }
    public String getDeptName(){
        return this.deptName;
    }
}
public class SecondLargestDept{
    public static String getSecondLargestDept(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
    }

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("A", "IT"),
                new Employee("B", "IT"),
                new Employee("C", "HR"),
                new Employee("D", "Finance"),
                new Employee("E", "IT"),
                new Employee("F", "Finance"),
                new Employee("G", "HR"));
        String secondLargestDept = getSecondLargestDept(employees);
        System.out.println("Second largest department: " + secondLargestDept);
    }
}
