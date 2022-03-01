package day17_While_DoWhileLoops;

import java.util.Scanner;

public class InsuranceQuote {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine().toLowerCase();


        System.out.println("Enter your gender: F / M");
        String gender = input.next().toLowerCase();

        while(!(gender.equals("F") || gender.equals("M"))){
            System.out.println("Please re-enter valid gender answer");
            gender = input.next().toLowerCase();
        }
        System.out.println("Are you married? yes/no");
        String married  = input.next().toLowerCase();
        while(!(married.equals("yes") || married.equals("no"))){
            System.out.println("Please re-enter valid answer");
            married  = input.next().toLowerCase();
        }
        System.out.println("Enter your age");
        int age = input.nextInt();
        while(!(age>0 && age<=120)){
            System.out.println("Please re-enter a valid age");
            age = input.nextInt();
        }
        System.out.println("How many miles you drive in a day?");
        int mile = input.nextInt();
        while(mile<5){
            System.err.println("Invalid entry, please re-enter your miles");
            mile = input.nextInt();
        }
        System.out.println("Do you want full coverage or liability insurance?");




    }
}
