package ifStatementPractice_FromMuhtarNotes;

public class CampusTime  {

    public static void main(String[] args) {
        
       int time =12;



       if(time >=1 && time <=24){

           String campusTime  = (time ==1)?   "CLOSED" :(time ==2)?  "CLOSED" : (time == 3) ? "CLOSED"
                   : (time == 4) ? "CLOSED" : (time == 5) ?   "CLOSED" : (time == 6) ?   "CLOSED"
                   : (time == 7) ?   "CLOSED" : (time == 8) ?    "OPEN" : (time == 9) ?    "OPEN"
                   : (time == 10) ?   "OPEN" : (time == 11) ?  "OPEN" : (time == 12) ?  "OPEN"
                   : (time == 13) ?   "OPEN" : (time == 14) ?    "OPEN" : (time == 15) ?   "OPEN"
                   : (time == 16) ?    "OPEN": (time == 17) ?    "OPEN": (time == 18) ?    "OPEN"
                   : (time == 19) ?    "OPEN": (time == 20) ?    "OPEN": (time == 21) ?    "OPEN"
                   : (time == 22) ?   "OPEN" : (time == 23) ?    "OPEN" : "CLOSED";
                    System.out.println(campusTime);
           } else {
           System.out.println("Invalid Time");
       }
       }

        
        
        
    }

