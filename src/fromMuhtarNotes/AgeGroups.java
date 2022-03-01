package fromMuhtarNotes;

public class AgeGroups {

    public static void main(String[] args) {

        int ageGroup = 121;
        if (ageGroup >= 1 && ageGroup <=120){
            if (ageGroup == 1 && ageGroup == 2) {
                System.out.println("Infant");
            } else if (ageGroup >= 3 && ageGroup <= 5) {
                System.out.println("Toddler");
            } else if (ageGroup >= 6 && ageGroup <= 9) {
                System.out.println("Kids");
            } else if (ageGroup >= 10 && ageGroup <= 12) {
                System.out.println("Pre-Teen");
            } else if (ageGroup >= 13 && ageGroup <= 17) {
                System.out.println("Teenager");
            } else if (ageGroup >= 18 && ageGroup <= 20) {
                System.out.println("Young Adult");
            } else if (ageGroup >= 21 && ageGroup <= 39) {
                System.out.println("Adult");
            } else if (ageGroup >= 40 && ageGroup <= 49) {
                System.out.println("Young Middle-Aged Adult");
            } else if (ageGroup >= 50 && ageGroup <= 54) {
                System.out.println("Middle-Aged Adult");
            } else if (ageGroup >= 55 && ageGroup <= 64) {
                System.out.println("Young Senior Citizen");
            } else if (ageGroup >= 65 && ageGroup <= 74) {
                System.out.println("Young Senior");
            } else if (ageGroup >= 75 && ageGroup <= 84) {
                System.out.println("Senior Citizen");
            } else {
                System.out.println("Old Senior Citizen");
            }

        }else{
            System.out.println("You are not human");

        }
    }
}