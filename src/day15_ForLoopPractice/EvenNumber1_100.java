package day15_ForLoopPractice;

public class EvenNumber1_100 {

    public static void main(String[] args) {
           int sum = 0;
        for (int i = 1; i <=100 ; i++) {
            if(i%2==0){
                System.out.print(i +" ");

                sum +=i;
            }
        }
        System.out.println();
        System.out.println("sum = " + sum);
    }


}
/*
1. Write a program that can return the sum of even numbers between 1 to 100

 */