package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("************************************************************");
        System.out.println("### Finding even numbers between a range of two numbers ###");
        System.out.println("************************************************************");

        int numberOne, numberTwo;
        List<Integer> even = new ArrayList<>();

        do {
            System.out.print("First number: ");
            numberOne = input.nextInt();

            System.out.print("Second number: ");
            numberTwo = input.nextInt(); 

            if (numberOne > numberTwo) {
                System.out.println("=========================================================");
                System.out.println("The first number cannot be less than the second. Try again!");
                System.out.println("=========================================================");
            }
        } while (numberOne > numberTwo);

        while (numberOne <= numberTwo){
            if (numberOne % 2 == 0) {even.add(numberOne);}
            numberOne = numberOne + 1;
        }

        System.out.println("The even numbers between this range are: " + even);
    }
}