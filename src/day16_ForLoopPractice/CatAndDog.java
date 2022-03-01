package day16_ForLoopPractice;

public class CatAndDog {

    public static void main(String[] args) {

        String sentence = "caT dog dogG cAt dog";
       sentence= sentence.toLowerCase();

       int frequencyDog=0;
       int frequencyCa =0;
       String result = "";

        for (int i = 0; i <=sentence.length()-3; i++) {
            String st1 = sentence.substring(i,i+3);
          if(st1.equals("cat")){
              frequencyCa++;
          }else if(st1.equals("dog")){
              frequencyDog++;
          }
          if(frequencyCa == frequencyDog){
             result ="True";
          }else{
             result ="False";
          }
        }

        System.out.println(result);

    }
}
/*
5. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true

 */