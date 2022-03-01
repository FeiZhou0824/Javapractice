package day14_StringPractice1.WeekendPractice;

import java.util.Scanner;

public class AddTwoWords {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("enter 2 words");
        String word1 = input.next();
        String word2 = input.next();

        char lastLetter = word1.charAt(word1.length()-1);
        char firstLetter = word2.charAt(0);

        if(lastLetter == firstLetter){
            System.out.println(word1 + word2.substring(1));
        }else{
            System.out.println(word1+word2);
        }


input.close();




    }
}
/*
4. Ask user to enter two words. Then add them together and print.
But if the last letter if the first word and the first letter of the
last letter is the same,
print that character once.
Input:
one
eight
Output:
oneight
 */