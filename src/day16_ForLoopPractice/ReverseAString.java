package day16_ForLoopPractice;

import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] args) {

        String str = "Wooden Spoon";
        String reversed = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            reversed =reversed + str.charAt(i);


        }
        System.out.println(reversed);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a String");

        String sentence = input.nextLine();
        String result = "";

        for (int i = sentence.length()-1 ; i >=0 ; i--) {
            result =result+ sentence.charAt(i);

        }
        System.out.println(result);
        input.close();
    }
}
