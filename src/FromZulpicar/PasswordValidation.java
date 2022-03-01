package FromZulpicar;

public class PasswordValidation {

    public static void main(String[] args) {

        System.out.println(validPassword("Feizhou08!"));

    }

    public static boolean validPassword(String password){

        boolean password1 = false;
        boolean result1 = false;
        boolean result2 = false;
        boolean result3 = false;
        boolean result4 =false;

        if(password.length()>=6 && !(password.contains(" "))){
           char [] array = password.toCharArray();
            for (char each : array) {
                if(Character.isUpperCase(each)){
                    result1 = true;
                }
                if(Character.isLowerCase(each)){
                    result2 = true;
                }
                if(!(Character.isLetterOrDigit(each))){
                    result3=true;
                }
                if(Character.isDigit(each)){
                    result4 = true;
                }
            }
            password1 = result1 && result2 && result3 && result4;

        }else{
            System.exit(0);
        }
     return password1;
    }
}
