package com.company.quadraticequation;

import java.util.Scanner;

public class MainProgramQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---Program solve Quadratic Equation---");
        System.out.println("Please input a,b,c");
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getA() == 0) {
            if (quadraticEquation.getB() == 0) {
                if (quadraticEquation.getC() == 0) {
                    System.out.println("The equation has many roots");
                } else {
                    System.out.println("The equation has no real roots");
                }
            } else {
                System.out.println("The equation has one root: " + -quadraticEquation.getC() / quadraticEquation.getB());
            }
        } else if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("The equation has no real roots");
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The equation has one root: " + -quadraticEquation.getB() / (2 * quadraticEquation.getA()));
        } else {
            System.out.println("The equation has two roots: " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        }
    }
}
