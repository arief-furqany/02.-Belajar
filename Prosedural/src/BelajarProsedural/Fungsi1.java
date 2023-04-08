package BelajarProsedural;
import java.util.Scanner;

public class Fungsi1 {

     //pembuatan fungsi 

// sebaiknya digunakan diluar main scope agar berfungsi secara global
//tentukan tipe data kembalian -> nama fungsi -> tipe data parameter

    //contoh kode untuk mengembalikan nilai integer.
    public static int aritmatika(int a, int b, int c){

        //int tambah = nama fungsi yang mengembalikan nilai berupa integer
        // (int a, int b) = parameter (nilai yang diterima fungsi sebagai masukan)
    
        int hasil = a + b * c;

        return hasil;
    }
    

    //contoh kode dengan nilai kembalian String
    public static String nama(String nm_depan, String nm_belakang){

        String nama_lengkap = nm_depan + nm_belakang; 

        return nama_lengkap;
    }

 // ("______________________________________________________________")

    //program utama
    static Scanner input = new Scanner(System.in);
    public static void main (String[] args){

    int a, b, c;
    String nm_depan, nm_belakang;

        //nilai yang akan digunakan oleh fungsi.
        a = 23; 
        b = 15;
        c = 45;

        nm_depan = ("arief");
        nm_belakang = ("furqany");

        String nama = nama_lengkap(nm_depan,nm_belakang);
        int hasil = aritmatika(a, b, c);

        System.out.println(nama);
        System.out.println(hasil);
    }


    //belum dipahami
    private static String nama_lengkap(String nm_depan, String nm_belakang) {
        return nama(nm_depan, nm_belakang);
    }

   
    
    


}