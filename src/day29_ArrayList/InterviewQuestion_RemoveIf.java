package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class InterviewQuestion_RemoveIf {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,5,6,100,200,300));

        numbers.removeIf(p -> p>=100);

        System.out.println(numbers);



    }
}
/*
ArrayList (2) -- Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
 */