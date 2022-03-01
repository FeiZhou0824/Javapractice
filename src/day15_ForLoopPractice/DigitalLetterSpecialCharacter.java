package day15_ForLoopPractice;

import java.util.Scanner;

public class DigitalLetterSpecialCharacter {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String str = input.next();
        String letters ="";
        String digitals = "";
        String specialCh = "";

        for (int i = 0; i <str.length(); i++) {
            char ch =str.charAt(i);
            if((ch>='a' && ch<='z')|| (ch>='A'&&ch<='Z')){
                letters = letters+ch;
            }
            if(ch>='0' && ch<='9'){
                digitals =digitals+ch;
            }
            if((ch>=33 && ch<=47) || (ch>=58&&ch<=64)){
                specialCh =specialCh+ch;
            }


        }



        System.out.println("letters = " + letters);
        System.out.println("digitals = " + digitals);
        System.out.println("specialCh = " + specialCh);

input.close();

    }
}
/*
5. write a program that can retive the digits, letters and special
characters from a string
Ex:
input:
mn@#123Ab!
output:
letters: mnAb
digits: 123
special chars: @#!
 */