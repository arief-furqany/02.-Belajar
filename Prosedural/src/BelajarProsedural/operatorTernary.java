package BelajarProsedural;
import java.util.Scanner;

public class operatorTernary {
    public static void main(String[] args) {
        System.out.println(" Belajar operator ternary");
        System.out.println("");

        Scanner inputnilai = new Scanner(System.in);

        System.out.println("masukkan nilai variable");
        int nilai = inputnilai.nextInt();

        //
        
        //variable hasil = result nilai
        //nilai < 20 = variable yang dipertanyakan
        // ? = pemisah anatara permasalahan dan penilaian
        //nilai*nilai = jika benar, maka varibel nilai di kuadratkan
        //nilai/nilai = jika salah maka variable nilai dibagi 2
        // : = pemisah statement nilai benar atau salah
        int hasil = (nilai < 20)  ? nilai*nilai : nilai/2;

        System.out.println(hasil);

    }





}
