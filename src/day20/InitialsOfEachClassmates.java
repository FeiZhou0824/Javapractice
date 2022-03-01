package day20;

import java.util.Arrays;

public class InitialsOfEachClassmates {

    public static void main(String[] args) {

        String [] names ={ "Fei Zhou", "Vera Li", "Sophia Lu", "Phoebe Lin", "Anna Lee", "Summer Huang", "Eva Chen", "Jenny Du", "Zoey Haines", "Tyler Haines"};
        for (int i = 0; i < names.length; i++) {
            String eachName = names[i];

           // System.out.println("eachName = " + eachName);

           String nameInitial = eachName.substring(0,1)+eachName.substring(eachName.indexOf(" ")+1,eachName.indexOf(" ")+2);
            System.out.println(nameInitial);

            String Initial = eachName.charAt(0) +"" + eachName.charAt(eachName.indexOf(' ')+1);
            System.out.println(Initial);


           // System.out.println("nameInitial = " + nameInitial);
            //System.out.println(initialForEachName);
           // System.out.println(Arrays.toString(names))

        }


    }
}
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */