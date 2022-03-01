package day13_StringPractice;

import java.util.Scanner;

public class InitialsOfTheUser {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 2 username:");
        String userName1 = input.next();
        String userName2 = input.next();

        //userName1=userName1.toUpperCase();
        char useName1Ch= userName1.toUpperCase().charAt(0);
        userName2=userName2.toUpperCase();
        char useName2Ch = userName2.charAt(0);

        System.out.println(useName1Ch + "." +useName2Ch);

input.close();


    }
}
/*
4. write a program that can return the initials of the user
ex:
cybertek
school
output:
C.S
Note: Pay attention to the example output
 */
