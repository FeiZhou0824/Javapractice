package day13_StringPractice;

import java.util.Scanner;

public class CheckWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 words");
        String word1 = input.next();
        String word2 =input.next();
        String word3 = input.next();

        int word1Length = word1.length();
        int word2Length = word2.length();
        int word3Length = word3.length();
        String result="";
        if(word1Length ==word2Length && word2Length ==word3Length){
            result = "All words are same length";
        }else if(word1Length == word2Length){
            result="Not Same nor Different lengths";
        }else if(word1Length == word3Length){
            result="Not Same nor Different lengths";
        }else if(word2Length == word3Length){
            result = "Not Same nor Different lengths";
        }else{
            result ="All different length";
        }

        System.out.println(result);
        input.close();
        /*String result="";
        if ( word1.length() == word2.length() && word2.length() ==word3.length() ){
            result = "All words are same length";
        }else if(word1.length() == word2.length()){
            result =  "Not Same nor Different lengths";
        }else if(word1.length() == word3.length() ){
            result =  "Not Same nor Different lengths";
        }else if(word2.length() == word3.length()) {
            result =  "Not Same nor Different lengths";
        } else {
            result = "All different length";
        }

         */
     /*   if(word1Length == word2Length && word1Length == word3Length  && word2Length==word3Length){
            result = "All words are same length";
        }else if(word1Length == word2Length ){
            result= "Not Same nor Different lengths";
        }else if(word1Length==word3Length){
            result = "Not Same nor Different lengths";
        }else if(word2Length ==word3Length);{
            result = "Not Same nor Different lengths";


        }

      */




    }
}
/*
7. Write a program  for CheckWords, the program accepts 3 words and :
- if they are same length:  print "All words are same length"
- if some same length and others not:    print "Not Same nor
Different lengths"
- if all different length :  print "All different length"
 */