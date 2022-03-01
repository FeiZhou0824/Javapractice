package day20;

public class GradeOfStudents {

    public static void main(String[] args) {

        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};
        char[] grades = new char[names.length];
        grades[0] = 'A';
        grades[1] = 'C';
        grades[2] = 'B';
        String result = "";


        for (int i = 0; i < names.length; i++) {
            String eachNames = names[i];
            int eachScore = scores[i];
            char eachGrade = grades[i];
            System.out.println(names[i] + "'s score is " +eachScore + ", and grade is " +eachGrade);
        }


        // System.out.println(result);

    }
}



/*
4. given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];

         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
         		Ex:
         			Anna's score is 90, and grade is A
 */