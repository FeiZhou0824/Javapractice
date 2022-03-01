package day17_While_DoWhileLoops;

import java.util.Scanner;

public class CalculatorSumOfNum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 2 numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int result = 0;

        while (!(num1 > 0 && num2 > 0)) {
            System.out.println("Please re-enter number");
            num1 = input.nextInt();
            num2 = input.nextInt();
        }
        System.out.println(num1 + num2);

        input.close();
    }







    }



/*
2. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop
 */