package day20;

public class PrintCommonElements {

    public static void main(String[] args) {

        int [] num1 = {1,2,3,4,5};
        int []num2 = {4,5,6,7,8};
        for (int i = 0; i < 5; i++) {
            System.out.println(num1[i]);

           System.out.println(num2[i]);
        }

    }
}
/*
7. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
 */