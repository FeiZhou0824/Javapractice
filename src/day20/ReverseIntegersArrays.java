package day20;



public class ReverseIntegersArrays {

    public static void main(String[] args) {
        int [] num = {1,2,3,4,5};
        String result="";
        for (int i = num.length - 1; i >= 0; i--) {
           result = result+num[i];
        }
        System.out.println(result);




        }


        }


/*5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
        array = {1,2,3,4,5};

        output:
        reversedArray = {5,4,3,2,1};

 */