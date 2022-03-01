package day14_StringPractice1;

import java.util.Scanner;

public class Practice3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a String");

        String word = input.next();

       int wordLength = word.length();
        System.out.println("wordLength = " + wordLength);

    char word1= word.charAt(wordLength-1);
    char word2 = word.charAt(wordLength-2);
    char word3=word.charAt(wordLength-3);
        System.out.println("word1 = " + word1);
        System.out.println("word2 = " + word2);
        System.out.println("word3 = " + word3);

        if(wordLength == 0){
            System.out.println("Empty");
        }else if(wordLength>3){
            System.out.println(word1 +""+ word2 +"" + word3 );

        }else {
            System.out.println(word);
        }
input.close();
    }


}



/*
3. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself

 */