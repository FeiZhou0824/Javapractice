package day20;

import java.util.Arrays;

public class MoveZeroToTheEnd {

    public static void main(String[] args) {

        int [] num ={10, 0, 5, 0, 1, 0};

Arrays.sort(num);

        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] +" ");
        }


    }
}
/*
6. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}

 */