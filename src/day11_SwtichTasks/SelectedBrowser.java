package day11_SwtichTasks;

public class SelectedBrowser {

    public static void main(String[] args) {
        String browserName = "Chrome";
        String result = "";

        switch (browserName){
            case"Chrome":
                result = browserName + " is selected brwoser";
                break;
            case"Firefox":
                result=browserName + " is selected brwoser";
                break;
            case"Opera":
                result=browserName + " is selected brwoser";
                break;
            case"safari":
                result=result=browserName + " is selected brwoser";
                break;
            case"edge":
                result=browserName + " is selected brwoser";
                break;
            default:
                result ="Invalid Browser";

        }

        System.out.println(result);



    }
}
/*
3.  write a program that can display the selected browser
            3.1  declear a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary
 */