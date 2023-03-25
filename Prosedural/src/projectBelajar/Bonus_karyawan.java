package projectBelajar;

import java.util.Scanner;

public class Bonus_karyawan{

public static void main(String[] args) {
    
    System.out.println(" Menghitung Bonus Karyawan ");

// Karyawan yang sudah bekerja lebih selama 3 tahun akan
// akan mendapatkan bonus gaji pokok sebanyak 20%

    Scanner scan = new Scanner(System.in);
    int Jumlah_lama_kerja, Jumlah_gaji; 
    String nama_karyawan;

    System.out.println("Masukkan nama karyawan :");
    nama_karyawan = scan.nextLine();
        
    System.out.println("Jumlah tahun karyawan bekerja :");
    Jumlah_lama_kerja = scan.nextInt();

    System.out.println("Berapakah Jumlah gaji anda saat ini? ");
    Jumlah_gaji = scan.nextInt();

    //untuk menutup inputStream dari Scanner
    scan.close();

    if (Jumlah_lama_kerja < 3){
        System.out.println ("Anda Belum bisa mendapatkan bonus");
    }else         if (Jumlah_lama_kerja > 3){
            System.out.println("Karena anda bekerja selama " + Jumlah_lama_kerja + " tahun, Maka Bonus gaji anda adalah" + Jumlah_gaji + 20/100);
    } else         if (Jumlah_lama_kerja > 5){
            System.out.println("Karena anda bekerja selama " + Jumlah_lama_kerja + "Maka Bonus gaji anda adalah" + Jumlah_gaji + 40/100);
    }
    else {
        System.out.println("input yang anda masukkan salah");

    }
}
}