package FromZulpikar;

import java.util.Arrays;

public class MoveAllZeroToTheEnd {

    public static void main(String[] args) {
        int [] arr = {5,2,3,0,1,4,50,0,5,0,7,0,9};
       int [] result1 = moveZeroToTheEnd(arr);
        System.out.println(Arrays.toString(result1));


    }

    public static int[] moveZeroToTheEnd(int [] array){
        int [] result = new int[array.length];
        int count = 0;
        for (int each : array) {

            if(each !=0){
                result[count++] =each;
            }
            
        }
        return result;
    }
}
/*
    write a program that can move all the zeros to the end of an array
     */