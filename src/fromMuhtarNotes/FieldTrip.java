package fromMuhtarNotes;

public class FieldTrip {

    public static void main(String[] args) {
        int gradeNumber = 8;
        if (gradeNumber >= 1 && gradeNumber <= 6) {
            if (gradeNumber == 1) {
                System.out.println("location -  Apple orchard\n" +
                        "        number of groups - 3\n" +
                        "        teacher in charge - Ms. Smith ");
            } else if (gradeNumber == 2) {
                System.out.println("location - Zoo\n" +
                        "        number of groups - 7\n" +
                        "        teacher in charge - Mr. Lee");
            } else if (gradeNumber == 3) {
                System.out.println("location - Aquarium\n" +
                        "        number of groups - 5\n" +
                        "        teacher in charge - Ms. Wilson");
            } else if (gradeNumber == 4) {
                System.out.println("location - Movie theater  \n" +
                        "        number of groups - 2\n" +
                        "        teacher in charge - Ms. Reyes");

            } else if (gradeNumber == 5) {
                System.out.println("grade - 5\n" +
                        "      location - Museum \n" +
                        "        number of groups - 5\n" +
                        "        teacher in charge - Ms. Lela ");
            } else {
                System.out.println(" grade - 6\n" +
                        "        location - Six Flags\n" +
                        "        number of groups - 8\n" +
                        "        teacher in charge - Mr. Watt");
            }

        }else{
            System.out.println("Invalid Grade");
        }
    }
}