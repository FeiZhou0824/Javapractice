package day10_Practice;

public class AgeGroup {

    public static void main(String[] args) {
        
        int number= 149;
        String ageGroup = "";
        
        if(number >=0 || number <21 ||(number >=21 &&number <55) || (number >55 && number <=150)){
            if(number<21){
                ageGroup = "Teenager";
            }else if(number>=21 && number <55){
                ageGroup= "Adult";
            }else{
                ageGroup="Senior";
            }
        }else{
            ageGroup = "Invalid";
        }
        System.out.println(ageGroup);
    }
}
