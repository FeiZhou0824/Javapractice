package day10_Practice;

public class GradeLevel {

    public static void main(String[] args) {

        byte number = 80 ;
        String gradeLevel = "";

        if(number>=1 && number <=18){
            if(number >=1 && number <=5){
                gradeLevel= "Elementary school";
            }else if(number >=6 && number <=8){
                gradeLevel="Middle school";
            }else if(number >=9 && number <=12){
                gradeLevel="High school";
            } else if(number>=13 && number <=16){
                gradeLevel ="College";
            }else{
                gradeLevel="Grad School";
            }

        }else{
            gradeLevel = "Invalid Grade Level Given";
        }
        System.out.println(gradeLevel);

    }
}
