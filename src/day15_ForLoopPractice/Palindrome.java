package day15_ForLoopPractice;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String word = input.next();
        String result = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            char ch = word.charAt(i);
            result = result + ch;
            //System.out.println(result);
            // System.out.print(ch);


        }
        boolean isPalindrome = word.equals(result);
        System.out.println(isPalindrome);
    }
}
/*
8. Write a program that can check if the given String is palindrome
Ex:
input:
Level
output:
true
input:
Anna
output:
true
 */