package day29_ArrayList;

public class BigChallenge {


    public static void main(String[] args) {

        String str = "--!--qwe--r-_?-tyf..3.gd.--9-";

        String result = "";
        String reverse="";

        for (int i = 0; i < str.length(); i++) {

            if(Character.isAlphabetic(str.charAt(i))){
                result += str.charAt(i)+" ";
            }
        }

        System.out.println(result);
        for (int j = result.length()-1; j >=0 ; j--) {

            char eachCh = result.charAt(j);
            reverse +=result.charAt(j);
        }
        System.out.println(reverse.trim());
    }
}
/*
Here is a big challenge.
"--!--qwe--r-_?-tyf..3.gd.--9-"
consider you have a string like the one above. You don't know how the string looks like.
 */