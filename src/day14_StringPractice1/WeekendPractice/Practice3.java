package day14_StringPractice1.WeekendPractice;

import java.util.Scanner;

public class Practice3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");

        String word = input.next();

        char firstWord = word.charAt(0);

        String result ="";
        if(firstWord == 'x'){
            result = word.substring(1);
        }else{
            result=word;
        }

        System.out.println(result);
        input.close();

    }
}
/*
. Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code

 */