package day14_StringPractice1;

import java.util.Scanner;

public class Practice6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter username");
        String username = input.next();

        System.out.println("Enter password");
        String password = input.next();

        String result="";

        if(username.equals("Cydeo") && password.equals("WoodenSpoon")){
            result = "Logged in";
        }else{
            result="Incorrect username or password";
        }
        System.err.println(result);

        input.close();






    }
}
/*
6. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials. If credentials are matched, your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message

    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method

 */