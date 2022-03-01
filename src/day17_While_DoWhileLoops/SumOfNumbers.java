package day17_While_DoWhileLoops;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int result = 0;
        while (true) {

            if (num1 > 0 && num2 > 0) {
                result = num1 + num2;
                System.out.println(result);
                System.out.println("Enter numbers");
                num1 = input.nextInt();
                num2 = input.nextInt();
            } else {
                System.out.println("Invalid number");
                break;
            }




        }
        input.close();
    }
}
/*
2. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop

 */