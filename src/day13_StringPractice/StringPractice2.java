package day13_StringPractice;

import java.util.Scanner;

public class StringPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 2 strings.");
        //System.out.println("Enter the second strings");

        String str1 = input.nextLine();
        String str2 = input.nextLine();

        int str1TotalLength = str1.length();
        int str2TotalLength = str2.length();

        System.out.println("str1TotalLength = " + str1TotalLength);
        System.out.println("str2TotalLength = " + str2TotalLength);

        input.close();
    }
}
