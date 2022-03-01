package day21_FroEachLoopPractice;

import java.util.Arrays;

public class Palindromes {

    public static void main(String[] args) {

      String [] names =  {"anna", "level", "Java"};

        int palindromes =0;

    /*  reversed[0] = names[names.length-1];
      reversed[1] =names[1];
      reversed[2] =names[0];

     */
        for (String eachName : names) {
            String reversed ="";
            //System.out.println(eachName);
           for (int i = eachName.length() - 1; i >= 0; i--) {
             reversed+= eachName.charAt(i);
               //System.out.println(reversed);
               if(eachName.equals(reversed)){
                   palindromes++;

            }
            }


        }
        System.out.println(palindromes);
        }


      //解体思路，找出每个名字，然后建立两个for each loop. 一个是正常顺序，一个是reverse , 如果正常顺利== reversed那就是palindromes.

       /* int palindromes =0;
        String reversed ="";

        for (String eachName : names) {
           // System.out.println(eachName);

            for (int i = eachName.length()- 1; i >= 0; i--) {
                System.out.println(eachName[i]+" ");


            }

        }


       System.out.println(reversed);

        */



    }

/*4. write a program that can count how many palindromes in an array of string
        Ex:
        {"anna", "level", "Java"};

        output:
        2


 */