package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double A, r;
        double pi = 3.14;
        System.out.print("Enter radius for circle: ");
        Scanner in = new Scanner(System.in);
        r = in.nextDouble();
        if (r <= 0) {
            System.out.println("Error: You entered a negative number");
        } else  {
            A = pi * r * r;
            System.out.println("Area of circle is: "+ A);
        }
    }
}

