import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args){
        System.out.println("Enter Number of Seconds for Convert: ");

        Scanner input = new Scanner(System.in);
        int seconds = input.nextInt();

        int hour = seconds / 3600;
        int remainSeconds = seconds % 3600;

        int minutes = remainSeconds / 60;
        int second = remainSeconds % 60;

        System.out.println(hour + "h " + minutes + "m " + second + "s");

        input.close();
    }


}
