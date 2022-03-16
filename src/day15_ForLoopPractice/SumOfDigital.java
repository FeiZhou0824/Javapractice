package day15_ForLoopPractice;

import java.util.Scanner;

public class SumOfDigital {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int digital = 0;
        String letter ="";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >='0' && ch <='9'){
                digital =digital+ch -'0';
            }
        }

        System.out.println(digital);
        








    }
}
/*
6. Write a program that can return the sum of digits from a  string
Ex:
input: A1B2C3
output:    6
Hint: You need to get each of the character by using a loop
             To convert char to number:

   '0' - 48   ==> 0

   '1' - 48   ==> 1
 */