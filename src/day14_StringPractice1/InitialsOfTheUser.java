package day14_StringPractice1;

import java.util.Locale;
import java.util.Scanner;

public class InitialsOfTheUser {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 words");

        String word1 = input.next();
        String word2 = input.next();

        char firstInitial = word1.toUpperCase(Locale.ROOT).charAt(0);
        char firstInitial2 = word2.toUpperCase(Locale.ROOT).charAt(0);
        System.out.println("firstInitial = " + firstInitial);
        System.out.println("firstInitial2 = " + firstInitial2);
        System.out.println(firstInitial + "." + firstInitial2);
        input.close();
    }
}
/*
2. write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S
 */