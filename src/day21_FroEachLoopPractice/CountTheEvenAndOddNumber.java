package day21_FroEachLoopPractice;

public class CountTheEvenAndOddNumber {


    public static void main(String[] args) {

       int [] numbers= {1,5,2,4,6,9,10};
        int count =0;
        int count2=0;
        int evenNumber = 0;
        int oddNumber = 0;

        for (int eachNumber : numbers) {


            if(eachNumber%2==0){
                //evenNumber = evenNumber+eachNumber;
                count ++;
            }
            if(eachNumber%2!=0){
               // oddNumber =oddNumber+eachNumber;
               count2++;
            }


        }
        System.out.println("evenNumber = " + count);
        System.out.println("oddNumber = "+ count2);




       /* int[] numbers = {3, 7, 8, 23, 46, 90, 2, 83, 64};
        int count1 = 0;
        int count2 = 0;
        for (int each : numbers) {
            if (each % 2 == 0) {
                count1++;
            }
            if (!(each % 2 == 0)) {
                count2++;
            }

        }
        System.out.println("Even numbers: " + count1);
        System.out.println("Odd numbers: " + count2);

        */
    }
}
/*
2. Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */