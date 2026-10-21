import java.util.Scanner;

public class leapyear {
    public static void main(String[] args){
         
        System.out.println("Enter year: ");
        Scanner input = new Scanner(System.in); // for make system make a variable by Scanner 
        int year = input.nextInt();  // for make system read the value from user

        if (year % 400 == 0){
            System.out.println("Leap Year");
        }else if (year % 100 == 0){
            System.out.println("Not a leap year");
        }else if (year % 4 == 0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }

        input.close();

    } 
}






// السنة الكبيسة هى اللى بتقبل القسمة على 400
// لو بتقبل القسمة على 100 فهمي مش كبيسة
// و لو مش الاتنين دول و بتقبل القسمة على 4 فهى كبيسة