import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Number of Repeat: ");

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int first = 0;
        int second = 1;

        for(int i = 0; i < n; i++){
            System.out.println(first);

            if(i < n - 1){
               System.out.println(" ");
            }

            int next = first + second;
            first = second;
            second = next;
        }

          System.out.println();
          input.close();
    }


}

