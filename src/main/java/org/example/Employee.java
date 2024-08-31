package org.example;

import java.math.BigDecimal;

public class Employee {
    Byte aByte;
    int memberVariable; // member variable, each member variable has it's separate copy of member variable.
    static int staticVariable = 100; // class variable or static variable, created once even if create multiple object of this class

    // default constructor
    Employee(){
    }
    // param constructor
    public Employee(int memberVariable) {
        this.memberVariable = memberVariable;
    }

    public Byte getaByte() {
        byte localVariable = 5;
        System.out.println("local variable : " + localVariable);
        return aByte;
    }

    public int dummyMemberMethod(int a){
        int localVariable = 12; // local variable, scope limited to within function
        return a;
    }

    public static void main(String[] args) {
        int a = -10;
        double float_value = 0.7;
        double double_value = 0.8456;
        BigDecimal bigDecimal_1 = new BigDecimal("0.7");
        BigDecimal bigDecimal_2 = new BigDecimal("0.574435");
        BigDecimal add = bigDecimal_1.add(bigDecimal_2);
        System.out.println(add);

        /**
         * Labeled and Unlabeled Break Statement
         */
        int i,j;
        boolean isBreak = false;
        outerloop:
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                if (i == 2 && j == 3) {
                    isBreak = true;
                    System.out.println("inner loop : labeled break with j");
                    break outerloop;
                }
            }
            if(isBreak){
                System.out.println("labeled outer loop iterating i");
            }
        }
        i = 0;
        j = 0;
        isBreak = false;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                if (i == 2 && j == 3) {
                    isBreak = true;
                    System.out.println("inner loop : unlabeled break with j");
                    break;
                }
            }
            if(isBreak)
                System.out.println("unlabeled outer loop with i");
        }
    }
}
