import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args){

        System.out.println("Enter 2 Words to check: ");

        Scanner input = new Scanner(System.in);

        String word1 = input.next();
        String word2 = input.next();

        if(word1.length() != word2.length()){
            System.out.println("NOT SAME LENGTH!");
        }else{

            char[] letter1 = word1.toCharArray(); 
            char[] letter2 = word2.toCharArray(); 

            Arrays.sort(letter1);
            Arrays.sort(letter2);

            if(Arrays.equals(letter1, letter2)){
                System.out.println(" YES ");
            }else{
                System.out.println(" NO ");
            }

        }

       input.close();

    }
}
