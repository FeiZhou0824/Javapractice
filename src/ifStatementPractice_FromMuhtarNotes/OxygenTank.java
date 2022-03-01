package ifStatementPractice_FromMuhtarNotes;

public class OxygenTank {

    public static void main(String[] args) {

        int number = 100;
        String oxygenLevel = "";

        if (number >= 50 && number <= 100) {
            if (number >= 90) {
                oxygenLevel = "Your tank is full ";
            } else if (number >= 80) {
                oxygenLevel = "Still okay";
            } else if (number >= 70) {
                oxygenLevel = "Don't go too far";
            } else if (number >= 60) {
                oxygenLevel = "Start to head back";
            } else {
                oxygenLevel = "Be careful now you at at 50%";
            }


        } else {
            oxygenLevel = "ERROR";
        }
        System.out.println(oxygenLevel);
    }


    }
