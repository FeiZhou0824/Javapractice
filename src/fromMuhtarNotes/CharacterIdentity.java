package fromMuhtarNotes;

public class CharacterIdentity {

    public static void main(String[] args) {

    char x = 97;
    if(x>=65 && x<=90 || x>=97 && x<=122){
        System.out.println("Alphabetic Character ");
    }else if(x>=48 && x <=57){
        System.out.println("Digital");
    }else{
        System.out.println("Special Character");
    }


    }
}
/*
4. Create a class called Character Identity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the chracters on ASCII table
 */