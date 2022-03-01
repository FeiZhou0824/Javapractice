package day21_FroEachLoopPractice;

public class InterviewQuestionILoveJava {

    public static void main(String[] args) {

        String str = "Java   is   fun";
        // print out : Java is fun

        String result = "";
        result = str.substring(0, str.indexOf("a ") + 2) + str.substring(str.indexOf("i"), str.indexOf("s") + 2) + str.substring(str.indexOf("f"), str.indexOf("n") + 1);
        System.out.println(result);


        String str1 = "Java is a programming language.";
        // method 1
        char[] chars = str1.toCharArray();
        String str2 = "";

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') { // as long as chars[i] is not space, will keep adding chars[i] to the result of str2
                str2 = str2 + chars[i];

            }
        }
        System.out.println(str2);
    }
}
