package quadratic.equation;

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
        if (quadraticEquation.a == 0) {
            if (quadraticEquation.b == 0) {
                if (quadraticEquation.c == 0) {
                    System.out.println("The equation has many roots");
                } else {
                    System.out.println("The equation has no roots");
                }
            } else {
                System.out.println("The equation has one root: " + -quadraticEquation.c / quadraticEquation.b);
            }
        } else if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("The equation has no roots");
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The equation has one root: " + -quadraticEquation.b / (2 * quadraticEquation.a));
        } else {
            System.out.println("The equation has two roots: " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        }
    }
}
