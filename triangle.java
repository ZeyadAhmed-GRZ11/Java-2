import java.util.Scanner;

public class triangle {
    
   public static void main(String[] args) {
        
       System.out.println("Enter lateral of triangle: ");

       Scanner input = new Scanner(System.in);

       double a = input.nextDouble();
       double b = input.nextDouble();
       double c = input.nextDouble();

       if (a <= 0 || b <=0 || c <= 0 || a+b<=c || b+c<=a || a+c<=b){
           System.out.println("Not a Triangle");
       }
       else if (a==b && b==c) {
            System.out.println("Equilateral");
       }
       else if(a==b || b==c || a==c){
                          System.out.println("Isosceles");

       }else{
                       System.out.println("Scalene");

       }

       input.close();
   }
}


