package day21_FroEachLoopPractice;

import java.util.Arrays;

public class descendingOrders {

    public static void main(String[] args) {


        int [] numbers = {1,5,6,8,7,20,30,60,4};

        Arrays.sort(numbers);
int  result =0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            int eachNumber = numbers[i];
            System.out.print(eachNumber +" ");
        };


    }
}
/*
1. Write a program that sort the array of integer in descending order
 */