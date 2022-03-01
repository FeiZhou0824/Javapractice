package day20;


import java.util.Arrays;

public class ReverseStudentName {

    public static void main(String[] args) {

        String[] studentNames = {"Fei Zhou", "Vera Li", "Sophia Lu", "Phoebe Lin", "Anna Lee", "Summer Huang", "Eva Chen", "Jenny Du", "Zoey Haines", "Tyler Haines"};

        for (int i = 0; i < studentNames.length; i++) {

            String eachStudentName = studentNames[i];
            for (int j = eachStudentName.length() - 1; j >= 0; j--) {
                char ch = eachStudentName.charAt(j);
                // System.out.println("ch = " + ch);
                String result = "";
                result = result + eachStudentName.charAt(j);
                System.out.print(result);
            }


        }
    }


/*String studentNames = "Tyler Haines";
        for (int i = studentNames.length()-1; i >= 0; i--) {
            char ch = studentNames.charAt(i);
           // System.out.println("ch = " + ch);
            //String eachStudentNames = studentNames[i];
           // System.out.println(eachStudentNames);
           String result = "";
           result = result +ch;
            System.out.print(result);
           // result = result+ eachStudentNames.charAt(i);
           // System.out.println(result);

        }

 */



    }

/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */