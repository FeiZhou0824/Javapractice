package day16_ForLoopPractice;

import java.util.Scanner;

public class UniqueCharacters {

    public static void main(String[] args) {


      String str = "AABCCD";
      //            BD

        String result ="";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(str.indexOf(ch) == str.lastIndexOf(ch)){ // if the first and last index numbers of the character are same, then the character is unique.

                result=result+ch;
            }
        }
        System.out.println(result);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter some characters");

        String str1 = input.next();
        String unique = "";

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if(str1.indexOf(ch)==str1.lastIndexOf(ch)){
                unique = unique+ch;
            }
        }

        System.out.println(unique);

input.close();

    }
}
/*
3. Write a program that can return the unique characters from a
String
Ex:
input:
AABCCD
output:
BD
Hint: You will need indexOf() and
lastIndexOf()
  if the first and last index
numbers of the character are same, then it's unique
  indexOf('A') ==> 0
  lastIndexOf('A') ==> 1
  indexOf('B') ==>2
  lastIndexOf('B') ==> 2
 */