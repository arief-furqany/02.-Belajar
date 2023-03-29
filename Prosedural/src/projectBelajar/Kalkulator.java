package projectBelajar;
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        System.out.println("Project Belajar Kalkulator");

        Scanner inputAngka = new Scanner(System.in);

        System.out.println("masukkan nilai a : ");
        int a = inputAngka.nextInt();
        
        System.out.println("masukkan operator : ");
        int operator = inputAngka.nextInt();

        System.out.println("masukkan nilai b : ");
        int b = inputAngka.nextInt();

        System.out.println("hasil operator " + a + operator + b );


    }


}