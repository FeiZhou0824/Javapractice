package day14_StringPractice1.WeekendPractice;

import java.util.Scanner;

public class EmailTask1 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        String email = input.next();
        //mike_tyson@gmail.com
        String lastName = email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String firstName = email.substring(0,email.indexOf("_"));

        String newEmail = lastName + "_" +firstName + email.substring(email.indexOf("@"));


        System.out.println(newEmail);
input.close();
    }
}
/*
7. Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Saperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
 */