package day17_While_DoWhileLoops;

import java.util.Scanner;

public class RoomReserve {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to reserve a room? Yes/No");
        String answer = input.next();
        String typeOfRoom = input.nextLine();

        while(!(answer.equals("yes") || answer.equals("no"))){
            System.out.println("Please re-enter your answer");
            answer = input.next().toLowerCase();

        }
        if (answer.equals("yes")) {
            System.out.println("Which type of room do you want to reserve? king bed / queen bed / single bed");
            typeOfRoom = input.nextLine();
            while (!(typeOfRoom.equalsIgnoreCase("king bed") || typeOfRoom.equalsIgnoreCase("queen bed") || typeOfRoom.equalsIgnoreCase("single bed"))) {
                System.out.println("Invalid room, please re select room");
                typeOfRoom = input.nextLine();
            }
            if (typeOfRoom.equalsIgnoreCase("king bed")) {
                System.out.println("King bed ===>120$");
            } else if (typeOfRoom.equalsIgnoreCase("queen bed")) {
                System.out.println("Queen bed ===>100$");
            } else if (typeOfRoom.equalsIgnoreCase("single bed")) {
                System.out.println("Single bed ===>80$");
            }
        }else {
            System.out.println("Have a nice day");
        }


input.close();


    }
}
