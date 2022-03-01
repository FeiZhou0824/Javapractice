package day14_StringPractice1;

import java.util.Scanner;

public class FirstAndLastCharSame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");

        String word = input.next();
        int wordTotalLenth =word.length();
        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(word.length()-1);
        System.out.println("firstLetter = " + firstLetter);
        System.out.println("lastLetter = " + lastLetter);

        String result = "";

        if(firstLetter==lastLetter){
            result = "Same";
        }else {
            result = "Not same";
        }

        System.out.println("result = " + result);
        input.close();
    }

}
/*
1. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
 */
