package day14_StringPractice1.WeekendPractice;

import java.util.Scanner;

public class WordWithoutX {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");

        String word = input.next();

        char firstCh = word.charAt(0);
        if(firstCh=='x'){
            System.out.println(word.substring(1));
        }

input.close();

    }
}
/*
3. Ask user to enter a word. If the work starts with x, print the
word without x.
Input:
xcode
Output:
code
 */