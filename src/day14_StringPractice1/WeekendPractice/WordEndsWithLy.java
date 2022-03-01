package day14_StringPractice1.WeekendPractice;

import jdk.dynalink.StandardNamespace;

import java.util.Scanner;

public class WordEndsWithLy {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");

        String word = input.next();

        if(word.endsWith("ly")){
            System.out.println("really");
        }else{
            System.out.println("never mind");
        }



input.close();


    }
}
/*
2. ask the user to enter a word. if the word ends with "ly", print
"really???" ,  otherwise, print "never mind"
 */