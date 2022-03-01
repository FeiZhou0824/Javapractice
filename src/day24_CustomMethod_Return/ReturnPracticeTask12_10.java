package day24_CustomMethod_Return;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReturnPracticeTask12_10 {

    public static void main(String[] args) {
       String word ="AAAABBBBCCCC";
       word=removeDuplicatedCharacters(word);
        System.out.println(word);

        int [] numbers = {10,20,30,40,50};
        int max = maxNumber(numbers);
        System.out.println(max);
        int min = minNumber(numbers);
        System.out.println(min);

       int [] numbers1 = {1,2,3,4,5};
       int [] reversed = reversedArr(numbers1);
        System.out.println(Arrays.toString(reversed));

        String [] word1= {"love","zoey"};
        String [] word2 = {"love","family"};

        String [] merge = mergeArrays(word1,word2);
        System.out.println(Arrays.toString(merge));






    }

    // 1. create a method that can remove duplicated characters from a string and returns the new value
    public static String removeDuplicatedCharacters (String word){
        String result ="";

        for (int i = 0; i < word.length(); i++) {
            char eachCh = word.charAt(i);
            if(!(result.contains(eachCh+""))){
                result =result+eachCh;
            }
        }
        return result;

    }

    //2. create a method that can return the maximum number from an array of integers

    public static int maxNumber (int [] numbers){

        int max = numbers[0];
        for (int eachNumber : numbers) {
           if(eachNumber>max){
               max=eachNumber;
           }
        }
        return max;
    }

    //3. create a method that can return the minimum number from an array of integers
    public static int minNumber (int []numbers){

        int min = numbers[0];
        for (int eachNumber : numbers) {
            if(eachNumber<min){
                min=eachNumber;
            }
        }
        return min;
    }

    //4. create a method that return the reversed array
    public static int [] reversedArr(int [] arr){

        int  [] reversed = new int [arr.length];
        for (int i = arr.length - 1 ,j=0; i >= 0; i--,j++) {
           reversed[j]=arr[i];

        }
        return reversed;
    }

    //5. create a method that can merge two arrays and return the new array
    public static String [] mergeArrays(String [] group1,String [] group2){

        String [] newGroup =new String [group1.length +group2.length];
        int index = 0;
        for (String eachName : group1) {
            newGroup[index] =eachName;
            index++;
        }
        for (String eachName : group2) {
            newGroup[index]=eachName;
            index++;

        }

       return newGroup;
    }





}
/*
Task:
    1. create a method that can remove duplicated characters from a string and returns the new value

    2. create a method that can return the maximum number from an array of integers

    3. create a method that can return the minimum number from an array of integers

    4. create a method that return the reversed array

    5. create a method that can merge two arrays and return
 the new array
 */