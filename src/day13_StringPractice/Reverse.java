package day13_StringPractice;

import java.util.Scanner;

public class Reverse {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String word = input.next();
        String reversed = "";

        if(word.length()==5){
            reversed = reversed + word.charAt(word.length()-1);
            reversed = reversed + word.charAt(3);
            reversed = reversed +word.charAt(2);
            reversed = reversed +word.charAt(1);
            reversed = reversed +word.charAt(0);
        }else if( word.length()>5){
            reversed = "too long";
        }else{
            reversed ="too short";
        }


        System.out.println(reversed);
input.close();

    }
}
/*
1. Create a class called Reverse, write a program that will reverse a
string.
Your program should reverse a string only 5 characters long.
If word is shorter, display message: "Too short!".
If word is longer, display message: "Too long!".
Otherwise, reverse this word and print out result into the console.
 */