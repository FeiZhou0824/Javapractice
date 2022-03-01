package day15_ForLoopPractice;

import java.util.Scanner;

public class ReverseString2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String word = input.nextLine();
        String reversed = "";

        for (int i = word.length()-1 ; i>=0 ;i--) {
            char eachCh =word.charAt(i);
            System.out.print(eachCh);

        }
input.close();

    }
}
/*
. Write a program that can reverse any given string
Ex:
input:
Wooden Spoon
output:
noopS nedooW
 */