package day21_FroEachLoopPractice;

import java.util.Arrays;

public class CommonElements {

    public static void main(String[] args) {

        int [] num1 =  {1,2,3,4,5};
        int [] num2 =  {4,5,6,7,8};


        for (int eachNum1 : num1) {

            for (int eachNum2 : num2) {
                if(eachNum1==eachNum2){
                    System.out.println(eachNum1);
                }



            }
        }

    }
}
/*
3. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5


          MUST use for each loops

 */