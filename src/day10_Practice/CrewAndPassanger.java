package day10_Practice;

public class CrewAndPassanger { //NEED HELP

    public static void main(String[] args) {

        int total= 75;
        String eachType = "";

        if(total ==50 || total== 75 || total== 100){
            if(total==50){
                eachType = "20 crew , 30 passengers";
            }else if(total ==75){
                eachType = "25 crew , 50 passengers";
            }else {
                eachType = "30 crew , 70 passengers";
            }

        }else{
            eachType="Not Valid";
        }


        System.out.println(eachType);
        System.out.println("------------------------");
        int num1 =9;
        int x =num1++;
        System.out.println(x);
        System.out.println(num1+x);
        if (num1++ == 10) {

            System.out.println("Hello World " + num1);
        }else{
            System.out.println("Hello Universe" +num1);
        }
int score =0;
        int y =score+=50;
        System.out.println(y);
    }
}
