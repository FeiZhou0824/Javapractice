package day14_StringPractice1.WeekendPractice;

import java.util.Locale;
import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");

        String word = input.next();

        char lastWord = word.charAt(word.length()-1);//y
        char lastWord2= word.charAt(word.length()-2);//l
        String result = "";
        if(lastWord =='y' && lastWord2 =='l'){
            result = "Really???";
        }else{
            result = "Never mind";
        }

        System.out.println(result);
        input.close();
    }

}
/*
2. ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
 */
