package fromMuhtarNotes;

public class NumberToWorld {

    public static void main(String[] args) {

        int score =170;
        if(score >=0 && score <=100) {
            if (score >= 60) {
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }
        }else{
            System.out.println("Invalid Number");
        }

            System.out.println("---------------------------------");
        int number = 10;
        if (number >=0 && number <=9) {
            if (number == 0) {
                System.out.println("Zero");
            } else if (number == 1) {
                System.out.println("One");
            } else if (number == 2) {
                System.out.println("Two");
            } else if (number == 3) {
                System.out.println("Three");
            } else if (number == 4) {
                System.out.println("Four");
            } else if (number == 5) {
                System.out.println("Five");
            } else if (number == 6) {
                System.out.println("Six");
            } else if (number == 7) {
                System.out.println("Seven");
            } else if (number == 8) {
                System.out.println("Eight");
            } else {
                System.out.println("Nine");
            }
           }else {
                System.out.println("Invalid Number");
            }
        }

       /* System.out.println("------------------------------------");
        String numberToWorld= (number ==0) ? "Zero" : (number ==1 )? "One" : (number == 3)? "Three" : (number == 4 )? "Four"
                :(number == 5)? "Five" :(number == 6)? "Six" :(number == 7)? "Seven" :(number == 8)? "Eight" : "Nine";

        System.out.println(numberToWorld);

        */

        
        




    }


/*1. Create a class called NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
        Ex:
        number = 1;

        output:
        One

 */