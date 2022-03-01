package day15_ForLoopPractice;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

       String str = "Hello World";
       String result = "";

      // result += str.charAt(str.length()-1); //d
     //  result+= str.charAt(str.length()-2);//l

        for (int i = str.length()-1 ; i >=0; i--) {
            result+=str.charAt(i);
        }
        System.out.println("result = " + result);
    }
}
