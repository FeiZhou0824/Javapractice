package day12_ScannerPractice;

import java.util.Scanner;

public class ConvertMilesToKilometers {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter miles");
        double miles = input.nextDouble();
        double kilometers = miles *1.609d;

        System.out.println((double)miles + " miles equal to " + kilometers + " kilometers");

        input.close();
    }
}
/*
4. Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers
 */