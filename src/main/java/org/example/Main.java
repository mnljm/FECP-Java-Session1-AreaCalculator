package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.\
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Area Calculator ===");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.print("Choose a shape (1-3): ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println();
                System.out.print("Enter the radius: ");
                double radius = sc.nextDouble();
                calculateCircleArea(radius);
                break;
            case 2:
                System.out.println();
                System.out.print("Enter the base: ");
                double base = sc.nextDouble();
                System.out.print("Enter the height: ");
                double height = sc.nextDouble();
                calculateTriangleArea(base, height);
                break;
            case 3:
                System.out.println();
                System.out.print("Enter the length: ");
                double length = sc.nextDouble();
                System.out.print("Enter the width: ");
                double width = sc.nextDouble();
                calculateRectangleArea(length, width);
                break;
        }


    }
    public static double calculateCircleArea(double radius){
        System.out.printf("Area of the circle: %.2f \n", (Math.PI*(radius*radius)));
        return Math.PI*(radius*radius);
    }

    public static double calculateTriangleArea(double base, double height){
        System.out.printf("Area of the triangle: %.2f \n", ((base*height)/2));
        return (base*height)/2;
    }

    public static double calculateRectangleArea(double length, double width){
        System.out.printf("Area of the rectangle: %.2f \n", (length*width));
        return length*width;
    }
}