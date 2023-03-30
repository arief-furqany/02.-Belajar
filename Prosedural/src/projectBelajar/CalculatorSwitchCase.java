package projectBelajar;

import java.util.Scanner;

public class CalculatorSwitchCase {
   public static void main(String[] args) {

      System.out.println("Kalkulator dengan menggunakan switch case");

      Scanner inputnilai = new Scanner(System.in);

      float a, b, hasil;
      String operator;

      System.out.println("masukkan nilai a= ");
      a = inputnilai.nextFloat();

      System.out.println("masukkan operator ");
      operator = inputnilai.next();

      System.out.println("masukkan nilai b= ");
      b = inputnilai.nextFloat();

      // fungsi darii break adalah untuk memisahkan setiap
      // tanpa perlu mengintip case yang lain ketika hasilnya true
      switch (operator) {
         // penambahan
         case "+":
            System.out.println(hasil = a + b);
            break;
         // pengurangan
         case "-":
            System.out.println(hasil = a - b);
            break;
         // pembagian
         case "/":
            System.out.println(hasil = a / b);
            break;
         // perkalian10
         case "*":
            System.out.println(hasil = a * b);
            break;
         default:
            System.out.println();
            break;
      }

   }
}
