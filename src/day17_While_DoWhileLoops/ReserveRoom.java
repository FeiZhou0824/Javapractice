package day17_While_DoWhileLoops;

import java.util.Scanner;

public class ReserveRoom {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to reserve a room? Yes / No?");

        String answer = input.next();
        String typeOfRoom = input.next();


        while (!(answer.equalsIgnoreCase("yes")  || answer.equalsIgnoreCase("no"))){
            System.out.println("Please re enter answer");
            answer = input.next();

        }
        if(answer .equalsIgnoreCase("yes")) {
            System.out.println("Which room you want to reserve ?  king bed / queen bed / single bed");
            typeOfRoom = input.next();
            while (!(typeOfRoom.equalsIgnoreCase("king bed") || (typeOfRoom.equalsIgnoreCase("queen bed") || (typeOfRoom.equalsIgnoreCase("single bed"))))) {
                System.out.println("please re select the room");
                typeOfRoom = input.next();
            }

            if (typeOfRoom.equalsIgnoreCase("kind bed")) {
                System.out.println( "King Bed ==> 120$");
            } else if (typeOfRoom.equalsIgnoreCase("queen bed")) {
                System.out.println( "Queen Bed ==> 100$");
            } else if (typeOfRoom.equalsIgnoreCase("single bed")) {
                System.out.println("single Bed ==> 80$");
            }
        }else {
                System.out.println("have a nice day");
            }



        input.close();

        }
}


