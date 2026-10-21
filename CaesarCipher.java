import java.util.Scanner;


public class CaesarCipher {
    public static void main(String[] args){

          System.out.println("Enter Word and Number for Shift: ");

          Scanner input = new Scanner(System.in);
          String text = input.next();
          int shift = input.nextInt();

          shift = ((shift % 26) + 26) % 26;

          String result = "";

          for(int i = 0; i < text.length(); i++){

               char ch = text.charAt(i);

               char encrypted = (char) ('a' + (ch + 'a') % 26); // تشفير الحرف الحالي بتحويله لرقم (0-25)، إضافة قيمة الإزاحة، ثم إعادته لحرف جديد
  
               result += encrypted;
          }


          System.out.println(result);

          input.close();

    }
}
