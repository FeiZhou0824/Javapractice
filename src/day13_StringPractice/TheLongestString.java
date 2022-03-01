package day13_StringPractice;

import java.util.Scanner;

public class TheLongestString {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter two strings");

        String str1 = input.nextLine();
        String str2 = input.nextLine();

        if(str1.length()> str2.length()){
            System.out.println(str1);
        }else{
            System.out.println(str2);
        }
        input.close();
    }
}
/*2. write a program that asks user to enter two strings, and print out the
        longest string

 */