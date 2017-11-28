package exercises;

import java.util.Scanner;

public class UserMiles {
    public static void main(String[] args){
        Double miles,gallons,miles_per_gallon;
        Scanner sc = new Scanner(System.in);

        //Read miles and gallons
        System.out.print("Enter driven miles : ");
        miles = sc.nextDouble();
        System.out.print("Enter gas consumed in gallons : ");
        gallons = sc.nextDouble();

        //Calculate miles_per_gallon
        miles_per_gallon = miles/gallons;
        System.out.println("Miles-per-Gallon: "+ miles_per_gallon);

    }
}
