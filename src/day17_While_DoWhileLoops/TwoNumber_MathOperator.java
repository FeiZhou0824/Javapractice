package day17_While_DoWhileLoops;

import java.util.Scanner;

public class TwoNumber_MathOperator {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers and math operator");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        char operator = input.next().charAt(0);
        int result=0;

        while(!(operator == '+' || operator =='-' || operator =='*' ||operator =='/')){
            System.out.println("Invalid operator, please re-enter the operator");
            operator = input.next().charAt(0);
        }

            if(operator=='+'){
                result = num1+num2;
            }else if(operator=='-'){
                result=num1-num2;
            }else if(operator=='*'){
                result=num1*num2;
            }else{
                result=num1/num2;
            }


        System.out.println(result);
            input.close();
    }
}
/*
3. write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)

 */