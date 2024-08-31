package org.example;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(123, "Rishabh Kumar");
        System.out.println("Hello world!" + student.getName() + " " + student.getId());
        Employee employee = new Employee();
        System.out.println("default value of Byte : " + employee.getaByte());
        /*
        Type Casting :
        1. Automatic type casting
        2. Explicitly type conversion
        3. Promotion during expression
        4. Explicitly casting during promotion expression
         */
        byte byteVar = 10;
        int intVariable = byteVar;
        int intVar = 128;
        /*
          Range of byte belongs to -128 to 127.
         */
        byte byteVar_a = (byte)intVar;
        System.out.println(intVariable + ", " + byteVar_a);

        /*
        Promotion during expression
         */
        byte byte_A = 127;
        byte byte_B = 1;
        int sum = byte_A + byte_B; // Exceeding byte range
        System.out.println(sum);

        /*
        Explicitly casting during promotion expression
         */
        int x = 12;
        double y = 13.1d;
        double sum_a = x + y;
        System.out.println(sum_a);
    }
}