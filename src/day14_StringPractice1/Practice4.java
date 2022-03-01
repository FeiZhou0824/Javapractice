package day14_StringPractice1;

import java.util.Scanner;

public class Practice4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 3 letter word");
        String word = input.next();
        int totalLength =  word.length();

        char middleWord = word.charAt(1);

        String result = "";

        if(totalLength == 3 && middleWord =='a'){
            result = "Cool word";
        }else if(totalLength == 3 && middleWord !='a'){
            result = "Okay word";
        }else if(totalLength>3){
            result = "word is too long";
        }else{
            result="Word is too short";
        }

        System.out.println(result);
        input.close();












    }
}
/*
4. write a program that asks the user enter a three letter word. Check if the middle character of the given word is 'a'. In the case it is print: "Cool word", but in the case the middle letter is not 'a' print: "Okay word".
     - If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"

 */