package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float hei, wid, base;
        Rectangle rectangle = new Rectangle();

        System.out.print("What is the height: ");
        hei = input.nextFloat();

        System.out.print("What is the width: ");
        wid = input.nextFloat();

        System.out.print("What is the base: ");
        base = input.nextFloat();

        System.out.println("=========================================");
        System.out.println("Area : " + rectangle.calcArea(hei, base));
        System.out.println("Perimeter: " + rectangle.calcPerim(hei, wid));
    }
}
 