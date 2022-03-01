package day20;

import java.util.Arrays;

public class ShoppingItems {

    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};
        String result = "";

        //items[3] = "Gloves";

       // int glovesFirstIndex = items[3].indexOf("Gl");
       // System.out.println("glovesFirstIndex = " + glovesFirstIndex);
        for (int i = 0; i < items.length; i++) {
            String eachItem = items[i];

            result = eachItem +" "+ prices[i] +" "+ itemIDs[i];
            System.out.println(result);

            if(eachItem.contains("Gloves")){
                System.out.println("First Index of Gloves is " + eachItem.indexOf("G"));
            }
            if(eachItem.contains("iPad")){
                System.out.println("It contains Ipad");
            }
        }


    }
}


/*
3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID

 */