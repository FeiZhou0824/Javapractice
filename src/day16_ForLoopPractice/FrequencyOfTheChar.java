package day16_ForLoopPractice;

import java.util.Scanner;

public class FrequencyOfTheChar {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a String and a Char");

        String str = input.nextLine();
        char ch = input.nextLine().charAt(0);
        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);

            if(ch == ch1){
                frequency++;
            }
        }

        System.out.println(frequency);



input.close();





    }
}
/*
2. Write a program that asks user to entera string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4

 */