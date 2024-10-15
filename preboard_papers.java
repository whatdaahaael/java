import java.util.*;
public class preboard_papers {
    public static void main(String args[]) {
        Scanner rinput=new Scanner(System.in);
        String sen;
        char ch;
        int wctr=1,lctr=0,loop1,dctr=0;
        System.out.println("Enter a Sentence.");
        sen=rinput.nextLine();
        for(loop1=0;loop1<sen.length();loop1++) {
            ch=sen.charAt(loop1);
            if(Character.isLetter(ch)) {
                lctr++;
            }
            else if(Character.isWhitespace(ch)&&Character.isLetter(sen.charAt(loop1+1))) {
                wctr++;
            }
            else if(Character.isDigit(ch)||!Character.isLetter(ch)||!Character.isWhitespace(ch)){
                dctr++;
                break;
            }
        }
        if(dctr>0) {
            System.out.println("There is a digit or a special character in ur sentence.");
        }
        else 
        {
            System.out.println("The number of Words in ur sentence = "+wctr);
            System.out.println("The number of Letter in ur sentence = "+lctr);
        }
        
    }
}
