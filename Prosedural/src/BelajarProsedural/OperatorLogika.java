package BelajarProsedural;

public class OperatorLogika{

   
    public static void main(String[] args) {
        System.out.println("Operator Logika");
        // System.out.println("adalah operator untuk membuat program logika dengan menggabungkan premis");

      int a = 10;
      int b = 20;
      int c = 30;

      // Logical AND operator
      if (a > b && a > c) {
         System.out.println("a is the largest number.");
      }

      // Logical OR operator
      if (b > a || c > a) {
         System.out.println("Either b or c is the largest number.");
      }

      // Logical NOT operator
      boolean x = true;
      boolean y = false;

      System.out.println(!x); // false
      System.out.println(!y); // true
    
    }
}
```

//This program defines three variables `a`, `b`, and `c` and uses both the logical `&&` and `||` operators in `if` statements to check their values. It also demonstrates the use of the logical `!` operator to negate boolean values.
   