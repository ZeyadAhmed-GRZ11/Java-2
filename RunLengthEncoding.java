import java.util.Scanner;

public class RunLengthEncoding {
    public static void main(String[] args){


        System.out.println("Enter text: ");

        Scanner input = new Scanner(System.in);

        String text = input.next();
        String result = "";

        int count = 1;

        for(int i = 0; i < text.length(); i++){

            if(i < text.length() -1 && text.charAt(i) == text.charAt(i + 1)){
                     count++;
            }

            else{
                 result += text.charAt(i);
                 result += count;
                 count = 1;
            }

        }

        System.out.println(result);

        input.close();


    }
}
