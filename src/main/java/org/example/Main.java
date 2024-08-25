package org.example;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(123, "Rishabh Kumar");
        System.out.println("Hello world!" + student.getName() + " " + student.getId());
        Employee employee = new Employee();
        System.out.println("default value of Byte : " + employee.getaByte());
    }
}