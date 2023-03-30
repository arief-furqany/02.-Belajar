package projectBelajar;
import java.util.Scanner;

public class KalkulatorIfElse {
    public static void main(String[] args) {
        System.out.println("Project Belajar Kalkulator");

        Scanner inputAngka = new Scanner(System.in);

        float hasil;

        // pembuatan Prosedur
        System.out.println("masukkan nilai a : ");
        float a = inputAngka.nextInt();
        
        System.out.println("masukkan operator : ");
        char operator = inputAngka.next().charAt(0);

        System.out.println("masukkan nilai b : ");
        float b = inputAngka.nextInt();

        //memberitahukan user operator yang mereka inputkan
        System.out.println(" adalah hasil operator : " + a + operator + b );

        // if statement untuk  pemilahan operasi
        if (operator == '+') {
            //penjumlahan
            hasil = a+b;
            System.out.println("hasil = " + hasil);
        } else  if (operator == '-'){
            //pengurangan
            hasil = a-b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '*'){
            // perkalian
            hasil = a*b;
            System.out.println("hasil = " + hasil);
        }  else if (operator == '/'){
            // pembagian
            if (b == 0){
                System.out.println("unlimited coyy");
                }else { 
                    hasil = a/b;
                    System.out.println("hasil = " + hasil);
                }
            } else {
        }


    }


}