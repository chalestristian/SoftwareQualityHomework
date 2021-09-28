package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;
        List<Integer> pares = new ArrayList<>();

        do {
            System.out.print("Insira o número inicial do intervalo: ");
            num1 = input.nextInt();

            System.out.print("Insira o número final do intervalo: ");
            num2 = input.nextInt();

            if (num1 > num2) {
                System.out.println("=========================================================");
                System.out.println("O numero final não pode ser menor do que o numero inicial");
                System.out.println("=========================================================");
            }
        } while (num1 > num2);

        while (num1 <= num2){
            if (num1 % 2 == 0) {pares.add(num1);}
            num1 = num1 + 1;
        }

        System.out.println("Os números pares contidos no intervado são: " + pares);
    }
}
