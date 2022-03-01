package day13_StringPractice;

import java.util.Scanner;

public class PrintFirst_LastCharacters {

    public static void main(String[] args) {




    Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");

        String sentence = input.nextLine();

        char firstCh = sentence.charAt(0);
        char lastCh = sentence.charAt(sentence.length()-1);

        System.out.println("firstCh = " + firstCh);
        System.out.println("lastCh = " + lastCh);

        input.close();

}
}
/*
1. write a program that asks user to enter a sentence.
then print the first & last characters of the sentence
 */