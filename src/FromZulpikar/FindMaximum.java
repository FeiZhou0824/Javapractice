package FromZulpikar;

public class FindMaximum {

    public static void main(String[] args) {

        int [] nums= {1,2,3,4,5,89,56};

        System.out.println(maxNumber(nums));
    }

    public static int maxNumber(int [] array){
        int max = array[0];

        for (int each : array) {
            if(each>max){
                max =each;
            }
        }
        return max;
    }
}
