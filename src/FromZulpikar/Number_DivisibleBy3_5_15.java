package FromZulpikar;

public class Number_DivisibleBy3_5_15 {


    public static void main(String[] args) {

        int number =100;
        String divisibleBy15 = "";
        String divisibleBy3 = "";
        String divisibleBy5 ="";

        for (int i = 1; i <= number; i++) {

            if(i %15 ==0){
                divisibleBy15 +=i +" ";



            }else if(i % 5 ==0){
                divisibleBy5 +=i +" ";
            }else if(i %3 == 0){
                divisibleBy3+=i + " ";
            }
        }
        System.out.println("divisibleBy15 = " + divisibleBy15);
        System.out.println("divisibleBy5 = " + divisibleBy5);
        System.out.print("divisibleBy3 = " + divisibleBy3  );



    }
}
