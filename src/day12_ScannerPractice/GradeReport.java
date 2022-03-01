package day12_ScannerPractice;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score");

        int score = input.nextInt();
        String grade = "";

        if(score>=0 && score<=100){
            if(score>=90 && score <=100){
                grade = "A";
            }else if(score>=80){
                grade = "B";
            }else if(score>=70){
                grade = "C";
            }else if(score >=60){
                grade= "C";
            }else {
                grade="F";
            }


        }else {
            grade = "Invalid score";
        }
        System.out.println(grade);

input.close();
    }
}
/*
2. GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score
 */