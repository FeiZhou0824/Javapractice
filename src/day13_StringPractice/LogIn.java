package day13_StringPractice;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username");
        String userName = input.next();
        System.out.println("Enter your password");
        String passWord = input.next();

        if(userName.equals("Cydeo") && passWord.equals("WoodenSpoon")){
            System.out.println("Logged in");
        }else{
            System.err.println("Incorrect Password");
        }

    }
}
/*
8. You are writing a code for the log-in function of the Cybertek
Application, assume that your credentials are:
username: Cydeo
password: WoodenSpoon
Ask the user to enter their credentials. If credentials are
matched, your program should print "Logged in."
otherwise print "Incorrect username or password" as error message
Hints: In order to login, both username and password MUST
be correct
you will need to use equals() method
 */