package com.company;

import jdk.dynalink.linker.support.TypeUtilities;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Employee employee = new Employee();

        for (int i = 1; i<=1; i++){
            employee.setCode(i);

            System.out.println("Employee name: ");
            employee.setName(input.nextLine());

            System.out.println("Employee hours worked: ");
            employee.setHoursWorked(input.nextFloat());
        }
        System.out.println(employee.getCode() + employee.getName() + employee.getHoursWorked());



    }
}
