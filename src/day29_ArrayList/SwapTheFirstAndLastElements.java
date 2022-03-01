package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapTheFirstAndLastElements {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
         Collections.swap(list,0,7);
        System.out.println(list);



    }

}
//1. write a program that can swap the first and last elements of an ArrayList of Integers