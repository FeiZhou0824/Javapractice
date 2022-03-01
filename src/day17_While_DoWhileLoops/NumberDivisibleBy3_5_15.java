package day17_While_DoWhileLoops;

import java.util.Scanner;

public class NumberDivisibleBy3_5_15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

       String divisibleBy15="";
        String divisibleBy3 ="";
        String divisibleBy5="";


        for (int i = 1; i <= num; i++) {
            if(i % 3 ==0 && i%5==0 && i%15==0){
               divisibleBy15 = divisibleBy15+ i+" ";
            }else if(i %3 ==0 && i%15!=0){
                divisibleBy3 += i+" ";
            }else if(i%5==0 && i%15!=0){
                divisibleBy5 += i+" ";
            }

        }
        System.out.println("divisibleBy15 = " + divisibleBy15);
        System.out.println("divisibleBy5 = " + divisibleBy5);
        System.out.println("divisibleBy3 = " + divisibleBy3);
        input.close();
    }
}
