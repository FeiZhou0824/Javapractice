package day14_StringPractice1.WeekendPractice;

import java.util.Scanner;

public class AccountNumber {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter an account number");
        String accountNumber = input.next();
        char firstCh = accountNumber.charAt(0);
        String result = "";
        if(firstCh == '2' && accountNumber.length()==7){
            result = "Valid";
        }else if(firstCh =='5' && accountNumber.length()==10){
            result = "Valid";
        }else{
            result ="Invalid account";
        }


        System.out.println(result);
input.close();
    }
}
/*
6. Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”

 */