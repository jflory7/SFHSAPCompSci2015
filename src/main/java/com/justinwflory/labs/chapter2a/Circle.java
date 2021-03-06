//**********************************************************
//  Circle.java
//
//  Print the area of a circle with two different radii
//**********************************************************

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
     
     Scanner scan = new Scanner(System.in);
     final double PI = 3.14159;
     
     System.out.println("Please enter a value for the radius...");
     int radius1 = scan.nextInt();
     double area1 = PI * radius1 * radius1;
     double circumference1 = 2 * (PI * radius1);
     

     System.out.println("The area of a circle with radius " + radius1 +
                        " is " + area1);
     System.out.println("The circumference of a circle with radius " +
                        radius1 + " is " + circumference1);

     
     int radius2 = radius1 * 2;
     double area2 = PI * radius2 * radius2;
     double circumference2 = 2 * (PI * radius2);

     System.out.println("The area of a circle with radius " + radius2 +
                        " is " + area2);
     System.out.println("The circumference of a circle with radius " +
                        radius2 + " is " + circumference2);
     
     double growthFactor = area2 / area1;
     
     System.out.println("The factor in which the area grew between the " +
                        "first and second area is " + growthFactor);

    }
}