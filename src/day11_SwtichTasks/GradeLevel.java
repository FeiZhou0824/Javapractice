package day11_SwtichTasks;

public class GradeLevel {

    public static void main(String[] args) {
        int number = 18;
        String result = "";

        if(number >=1 && number<=18){
            switch (number){
                case 1: case2: case3: case4: case5:
                    result= "Elementary school";
                    break;
                case 6: case 7: case 8:
                    result="Middle School";
                    break;
                case 9: case 10: case 11: case 12:
                    result="High school";
                    break;
                case 13: case 14: case 15: case 16:
                    result="College";
                    break;
                default:
                    result="Grad School";




            }

        }else{
            result = "Invalid grade level given";
        }
        System.out.println(result);
    }
}
