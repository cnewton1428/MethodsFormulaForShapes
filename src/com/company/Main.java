package com.company;

import java.util.Scanner;

public class Main {
//
//    static Scanner input = new Scanner(System.in);
//
//    public static void main(String[] args) {
//	// Writing Methods: Area of Shapes
//
//
//
//        System.out.println("What kind of shape do you want to calculate the area for? A circle, triangle, rectangle, or a square");
//        String enter = input.nextLine();
//        double shapes = getValue(enter);
//
//    }
//
//    public static double getValue(String enter) {
//        double shapes = 0, Circle, Triangle, Rectangle, Square = 0;
//
//        if (enter.equalsIgnoreCase("circle")){
//            System.out.println("Input radius of circle");
//            double radius = input.nextDouble();
//            Circle =  (3.14*(radius*radius));
//            System.out.println(Circle);
//        }else if (enter.equalsIgnoreCase("triangle")){
//            System.out.println("Enter base of triangle");
//            double base = input.nextDouble();
//            System.out.println("Enter height of triangle");
//            double height = input.nextDouble();
//            Triangle = ((1/2)*(base*height));
//            System.out.println(Triangle);
//        }else if (enter.equalsIgnoreCase("rectangle")){
//            System.out.println("Enter length of rectangle");
//            double length = input.nextDouble();
//            System.out.println("Enter width of rectangle");
//            double width = input.nextDouble();
//            Rectangle = (length*width);
//            System.out.println(Rectangle);
//        }else {
//            System.out.println("Enter one side of the square");
//            double side = input.nextInt();
//            Square = (side*side);
//            System.out.println(Square);
//        }
//        return shapes;
//
//    }
//}

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What kind of shape do you want to calculate the area for? A circle, triangle, rectangle, or a square");
        String enter = input.nextLine();
        double shape1 = getValueForCircle(enter);
        double shape2= getValueForTriangle(enter);
        double shape3 = getValueForRectangle(enter);
        double shape4 = getValueForSquare(enter);
    }

    public static double getValueForCircle(String enter) {
        double shape1 = 0;
        if (enter.equalsIgnoreCase("circle")) {
            System.out.println("Input radius of circle");
            double radius = input.nextDouble();
            double Circle = (3.14 * (radius * radius));
            System.out.println("The area is : " + Circle);

        }
        return shape1;
    }

    public static double getValueForTriangle(String enter) {
        double shape2 = 0;
        if (enter.equalsIgnoreCase("triangle")) {
            System.out.println("Enter base of triangle");
            double base = input.nextDouble();
            System.out.println("Enter height of triangle");
            double height = input.nextDouble();
            double Triangle = ((0.5) * (base * height));
            System.out.println("The area is : " + Triangle);
        }
        return shape2;
    }

    public static double getValueForRectangle(String enter) {
        double shape3 = 0;
        if (enter.equalsIgnoreCase("rectangle")) {
            System.out.println("Enter length of rectangle");
            double length = input.nextDouble();
            System.out.println("Enter width of rectangle");
            double width = input.nextDouble();
            double Rectangle = (length * width);
            System.out.println("The area is : " + Rectangle);
        }
        return shape3;
    }

    public static double getValueForSquare(String enter) {
        double shape4 = 0;
        if (enter.equalsIgnoreCase("square")) {
            System.out.println("Enter one side of the square");
            double side = input.nextInt();
            double Square = (side * side);
            System.out.println("The area is : " + Square);
        }
        return shape4;
    }
}