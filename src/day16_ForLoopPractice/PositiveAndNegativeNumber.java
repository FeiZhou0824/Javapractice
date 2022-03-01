package day16_ForLoopPractice;

import java.util.Scanner;

public class PositiveAndNegativeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 number");

      /*  int n1= input.nextInt();
        int n2= input.nextInt();
        int n3= input.nextInt();
        int n4= input.nextInt();
        int n5= input.nextInt();
           String result="";

       */
          int positiveNum = 0;
          int negtiveNum =0;

        for (int i = 0; i <=4; i++) {
           int num = input.nextInt();
            if(num>=0 ){
                positiveNum++;
            }else if(num<0){
                negtiveNum++;
            }
        }

        System.out.println(positiveNum + " Positive " + negtiveNum + " Negtive");
        input.close();

    }
}
  /*  Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
        Ex:
        Inputs:
        10
        20
        -1
        0
        3

        Output:
        3 positive and 1 negative

   */