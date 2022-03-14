package com.packaged;
import java.sql.SQLOutput;
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Calculator");
        System.out.println("==============");
        boolean condition;
        do {
            System.out.print("Enter First Number: ");
            Scanner scan1 = new Scanner(System.in);
            int x = scan1.nextInt();
            System.out.print("Enter Second Number: ");
            Scanner scan2 = new Scanner(System.in);
            int y = scan2.nextInt();

            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiply");
            System.out.println("4. Division");
            System.out.println("5. Modulo");
            System.out.println("6. Power");
            System.out.println("7. Exit");
            int choice = 0;
            Scanner scan3 = new Scanner(System.in);
            choice = scan3.nextInt();
            int answer = 0;
            double answers = 0;
            condition = true;

            if (choice == 1) {
                answer = x + y;
                System.out.println("Answer = " + answer);
            } else if (choice == 2) {
                answer = x - y;
                System.out.println("Answer = " + answer);
            } else if (choice == 3) {
                answer = x * y;
                System.out.println("Answer = " + answer);
            } else if (choice == 4) {
                answers = x / y;
                System.out.println("Answer = " + answers);
            } else if (choice == 5) {
                answer = x % y;
                System.out.println("Answer = " + answer);
            } else if (choice == 6) {
                answers = Math.pow(x, y);
                System.out.println("Answer = " + answers);
            } else if (choice == 7) {
                condition = false;
            }
        }
        while (condition = true);
    }
}
