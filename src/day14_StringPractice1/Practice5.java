package day14_StringPractice1;

import java.util.Scanner;

public class Practice5 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 words");

        String word1 = input.next();
        String word2 = input.next();
        String word3 = input.next();
        int word1length = word1.length();
        int word2length = word2.length();
        int word3length = word3.length();
        String result = "";

        if(word1length ==word2length && word1length== word3length && word2length == word3length){
            result="All words are same length";
        }else if(word1length !=word2length && word2length != word3length &&word1length !=word3length){
            result="All different length";
        }else{
            result="Not Same nor Different lengths";
        }
        System.out.println(result);
        input.close();










    }


}
/*
5. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"

 */