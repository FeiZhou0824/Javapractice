package day10_Practice;

public class Grade {

    public static void main(String[] args) {
      char n = 'E';
      String grade="";
      if(n== 'A' || n=='B' || n == 'C' || n== 'D' || n=='F'){
          if(n=='A'){
             grade = "excellent";
          }else if(n=='B')
          {
              grade = "great job";
          }else if(n == 'C'){
              grade= "good";
          }else if(n=='D'){
              grade= "passed";
          }else{
              grade= "Failed";
          }

        }else{
          grade = "Invalid";
      }
        System.out.println(grade);


    }
}
