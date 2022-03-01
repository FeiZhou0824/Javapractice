package day13_StringPractice;

import java.util.Scanner;

public class StringPractice1 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentence = input.nextLine();

        char firstChar = sentence.charAt(0);
        char lastChar = sentence.charAt(sentence.length()-1);

        System.out.println("First Character is " + firstChar + " and Last Character is " + lastChar);


        input.close();
    }
}
