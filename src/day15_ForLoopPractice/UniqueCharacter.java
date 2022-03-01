package day15_ForLoopPractice;

public class UniqueCharacter {

    public static void main(String[] args) {

        String str = "aaabcccd";

        String result = "";

        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i); //print out each character
            // System.out.println(ch);
           if(str.indexOf(ch)==str.lastIndexOf(ch)){
               result +=ch ; // or result +=ch;

           }
        }

        System.out.println("result = " + result);




    }
}
/*
 2. Write a program that can return the unique characters from a String

            Ex:
                input:
                    AABCCD

                output:
                    BD

            Hint: You will need indexOf() and lastIndexOf()
                  if the first and last index numbers of the character are same, then it's unique

 */
