package day15_ForLoopPractice;

import java.util.Scanner;

public class FactorialNumber_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");

        int number = input.nextInt();
        int factorial = 1;

        for (int i = number; i >=1; i--) {
            factorial =factorial*i;
        }
        System.out.println(factorial);
input.close();
    }
}
/*
4. Write a program that can return the factorial number of any given
number
Ex:
input: 5
output: 120
( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */