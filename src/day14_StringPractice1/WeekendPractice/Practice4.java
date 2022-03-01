package day14_StringPractice1.WeekendPractice;

import java.util.Scanner;

public class Practice4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 words");

        String word1 = input.next();
        String word2 = input.next();

        char word1Last = word1.charAt(word1.length()-1);
        char word2last = word2.charAt(0);
        String result ="";
        if(word1Last == word2last){
            result= (word1+word2.substring(1));
        }else {
            result=(word1)+(word2);
        }

        System.out.println(result);
        input.close();


    }
}
/*
4. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

 */