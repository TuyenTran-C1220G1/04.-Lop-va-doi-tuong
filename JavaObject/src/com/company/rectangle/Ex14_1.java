package com.company.rectangle;

import java.util.Scanner;

public class Ex14_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width: ");
        double width = scanner.nextDouble();

        System.out.println("Enter the height: ");
        double height = scanner.nextDouble();

        Rectangle rec1 = new Rectangle(width, height);

        System.out.println("Your rectangle: " + rec1.display());
        System.out.println("Area of the rectangle: " + rec1.getArea());
        System.out.println("Perimeter of the rectangle: " + rec1.getPerimeter());
    }
}
