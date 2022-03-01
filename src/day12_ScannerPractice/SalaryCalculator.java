package day12_ScannerPractice;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your hourly rate");
        int hourlyRate = input.nextInt();

        System.out.println("Enter how many hours you work in a week");
        double workTime = input.nextDouble();

        System.out.println("Enter the state tax in percentage");

        double stateTax = input.nextDouble()/100;

        System.out.println("Enter the federal tax in percentage");

        double federalTax = input.nextDouble()/100;

        double salary = (hourlyRate * workTime) *52;
        double totalTax = stateTax + federalTax;
        double netIncome = salary - (salary * totalTax);
        System.out.println("Salary is " + salary);
        System.out.println("State tax is " + stateTax);
        System.out.println("Fedex Tax is " + federalTax);
        System.out.println("Total tax is " + totalTax);
        System.out.println("Net income is " + netIncome);

input.close();
    }
}
/*
SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */