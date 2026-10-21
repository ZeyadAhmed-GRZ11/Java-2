import java.util.Scanner;

public class CountAboveAvg {
    public static void main(String[] args){


        System.out.println("Enter Number of Numbers: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] numbers = new int[n];
        int sum = 0;

        for(int i = 0; i < n; i++){
            System.out.println("Enter Number: ");
            numbers[i] = input.nextInt(); 
            sum += numbers[i];
        }

        System.out.println("Sum is: " + sum);

        double avg = (double) sum / n;
        int count = 0;

        System.out.println("Avg is: " + avg);
        
        for(int i = 0; i < n; i++){
             if(numbers[i] > avg){
                count ++;
        }}

     System.out.println("Above Avg is: " + count);
     input.close();

    }
}

