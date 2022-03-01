package day16_ForLoopPractice;

import java.util.Scanner;

public class RemoveTheDuplicatedCharacters {

    public static void main(String[] args) {

        String str = "AABBCCBC";
        //         = ABC
String result ="";
        for (int i = 0; i < str.length() ; i++) {

            String ch =""+ str.charAt(i); // i: means each characters in the str.
            //result = result+ch;
            if(!result.contains(ch)){ // if the character is not contained i the result.
                result +=ch;

            }

        }

        System.out.println(result);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string that have same characters");
        String str1 = input.next();
        String result1 = "";

        for (int i = 0; i < str1.length() ; i++) {
            char ch = str1.charAt(i);
            if(!(result1.contains(ch+""))){
                result1 =result1+ch;
            }

        }
        System.out.println(result1);
    }
}
