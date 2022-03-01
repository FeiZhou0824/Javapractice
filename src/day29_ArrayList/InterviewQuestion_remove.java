package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class InterviewQuestion_remove {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

       names.addAll(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        //names.removeAll(Arrays.asList("Ahmed"));
        names.removeIf( p -> p.equals("Ahmed"));
        System.out.println(names);

        }




    }

/*
ArrayList(1) -- Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
 */