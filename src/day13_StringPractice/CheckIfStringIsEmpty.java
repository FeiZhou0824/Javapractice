package day13_StringPractice;

import java.util.Scanner;

public class CheckIfStringIsEmpty {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String result = "";

        if(str1.length()==0){
            result="String is empty";
        }else if(str1.length()>3){
            result =str1.charAt (str1.length()-3) +""+ str1.charAt(str1.length()-2) + str1.charAt(str1.length()-1)+"";
        }else{
            result=str1;
        }
        System.out.println(result);

input.close();

    }
}
/*
5. Write a method that asks user to enter a string.
if the string is empty, print: string is empty
if the string has more than 3 characters, print the last three
characters
if the string has less than or equal 3 characters, print the
string itself
 */