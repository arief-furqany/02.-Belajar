package projectBelajar;
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        System.out.println("Project Belajar Kalkulator");

        Scanner inputAngka = new Scanner(System.in);

        float hasil;

        // pembuatan Prosedur
        System.out.println("masukkan nilai a : ");
        float a = inputAngka.nextInt();
        
        System.out.println("masukkan operator : ");
        String operator = inputAngka.nextLine();

        System.out.println("masukkan nilai b : ");
        float b = inputAngka.nextInt();

        // if statement untuk  pemilahan operasi
        if (operator == "+") {
            //penjumlahan
            hasil = a+b;
            System.out.println("hasil = " + hasil);
        } else  if (operator == "-"){
            //pengurangan
            hasil = a-b;
            System.out.println("hasil = " + hasil);
        } else if (operator == "*"){
            // perkalian
            hasil = a*b;
            System.out.println("hasil = " + hasil);
        } else if (operator == "/"){
            // pembagian
            hasil = a/b;
            System.out.println("hasil = " + hasil);
        } else {
        }


        System.out.println("hasil operator : " + a + operator + b );


    }


}