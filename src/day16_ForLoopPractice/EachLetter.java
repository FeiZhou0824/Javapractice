package day16_ForLoopPractice;

import java.util.Scanner;

public class EachLetter {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        //write your code below
        String eachCharacter ="";

        for (int i = 0; i < word.length(); i++) {
            eachCharacter = eachCharacter +  word.charAt(i)+"\n";
        }

        System.out.println(eachCharacter);
inp.close();


    }
}
