package FromZulpikar;

public class SumOfDigits_String {

    public static void main(String[] args) {

        System.out.println(sum("5h8g9s45g645gfdg"));

    }

    public static int sum(String s){

        char[] array = s.toCharArray();
        int sum = 0;
        for (char each : array) {
            if(Character.isDigit(each)){
                sum =sum+ Integer.parseInt(each +"");
            }
        }
        return sum;
    }




}
