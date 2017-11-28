package exercises;

import java.util.Scanner;

public class HelloGreet {
    public static void main(String[] args){
        String name;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Name to greet: ");
        name = in.next();
        System.out.println("Hello, " + name);
    }


}
