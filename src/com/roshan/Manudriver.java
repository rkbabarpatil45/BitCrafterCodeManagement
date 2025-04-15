package com.roshan;

import java.util.Scanner;
public class Manudriver {
    public static void main(String[] args) {
    	demo();
    }
    static void demo() {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int fir = sc.nextInt();
        System.out.print("Enter second number: ");
        int sec = sc.nextInt();
        System.out.println("These is your options: ");
        System.out.println("for Addition press  - 1");
        System.out.println("for Subtraction press - 2");
        System.out.println("for Multiply press -  3");
        System.out.println("for Divide press  -   4");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        if (choice == 1) {
            int result = fir + sec;
            System.out.println("The result of addition is: "+result);
        } else if (choice == 2) {
            int result = fir - sec;
            System.out.println("The result of subtraction is: " + result);
        } else if (choice == 3) {
            int result = fir * sec;
            System.out.println("The result of multiplication is: " + result);
        } else if (choice == 4) {
                int result = fir / sec;
                System.out.println("The result of division is: " + result);
            }
          else {
           System.out.println("Invalid choice....");
       }
    }
}