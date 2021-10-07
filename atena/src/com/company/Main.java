package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Array numeros com 5 posições.
        int[] numeros = new int[5];
        // O maior numero do array é definido como sendo o primeiro numero inserido.
        int maior = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira um numero: ");
            numeros[i] = scanner.nextInt();
            // Aqui o será comparado todos os numeros inseridos e salvando o maior.
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("O maior numero digitado é: " + maior);
        scanner.close();
    }
}