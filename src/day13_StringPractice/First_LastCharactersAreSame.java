package day13_StringPractice;

import java.util.Scanner;

public class First_LastCharactersAreSame {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();

        char firstCh = word.charAt(0);
        char lastCh= word.charAt(word.length()-1);

        if(firstCh == lastCh ){
            System.out.println("Same");
        }else{
            System.out.println("Not same");
        }
        input.close();
    }

}
/*
3. write a program that can check if the first and last characters of the
string are same
ex:
level
output:
same
 */
