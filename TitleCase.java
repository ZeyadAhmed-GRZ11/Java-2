import java.util.Scanner;

public class TitleCase {
    public static void main(String[] args) {
        
        System.out.println("Input Words: ");

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] words = sentence.split("\\s+");
        String result = "";

        for(int i = 0; i < words.length; i++){
            if(words[i].length() > 0){

                  result += Character.toUpperCase(words[i].charAt(0));

                  result += words[i].substring(1).toLowerCase();
            }

            if(i < words.length -1){
                result += " ";
            }
        }

      System.out.println(result);

    }
}
