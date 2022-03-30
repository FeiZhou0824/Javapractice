package day16_ForLoopPractice;


import java.util.Scanner;

public class Frequency {

    public static void main(String[] args) {

       // Scanner input = new Scanner(System.in);
        System.out.println("enter a str like :aabcccd ");
      //  String str = input.next();
        System.out.println("enter a ch that contains one letter from the string you entered");
       // char ch = input.next().charAt();
        String str = "aabbcccdddd";
        char ch = 'c';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);
            if(eachChar == ch){
                count++;
            }
        }
        System.out.println(count);

    }
}