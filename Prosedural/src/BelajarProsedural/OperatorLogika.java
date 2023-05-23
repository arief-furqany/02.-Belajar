package BelajarProsedural;

public class OperatorLogika{

   
    public static void main(String[] args) {
        System.out.println("Operator Logika");
        // System.out.println("adalah operator untuk membuat program logika dengan menggabungkan premis");

      int a = 10;
      int b = 20;
      int c = 30;

      // Logical && 
      if (a > b && a > c) {
      // a > b, dan a > c. keduanya bernilai benar secara logika informatika,
      // namun secara matematis keduanya bernilai salah
         System.out.println("a is the largest number.");

      //another example with ternary operator dan untuk ternary lebih cocok
      //digunakan pada fungsi
      boolean a = true;
      boolean b = true;
             
      String result = (a && b) ? "Both a and b are true" : "At least one of a and b is false";
      System.out.println(result);
         }
     }
      }

      // Logical OR operator
      if (b > a || c > a) {
      // b > a, atau c > a. secara informatika akan bernilai benar
      // jika salah satunya bernilai benar jika salah satunya bernilai benar
         System.out.println("Either b or c is the largest number.");

      ////another example with ternary operator
      , 
      }

      // Logical NOT operator (negasi)
      boolean x = true;
      boolean y = false;

      //ini adalah negasi
      System.out.println(!x); // false
      System.out.println(!y); // true

      // Logical if then (implikasi)
      if (c >= a){
         System.out.println("c is greater than a");
      } else {
         System.out.println("c is smaller than a");
      }
      



   }}

// This program defines three variables `a`, `b`, and `c` and uses both the
// logical `&&` and `||` operators in `if` statements to check their values. It
// also demonstrates the use of the logical `!` operator to negate boolean
// values.
