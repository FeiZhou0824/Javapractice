package day14_StringPractice1.WeekendPractice;

import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 words");

        String word1 = input.next();
        String word2 = input.next();
       word1= word1.substring(1);
       word2=word2.substring(1);

        System.out.println(word1+word2);
        input.close();



    }
}
/*
 1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */