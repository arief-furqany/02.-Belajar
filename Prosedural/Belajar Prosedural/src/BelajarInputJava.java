
import java.util.Scanner;

public class BelajarInputJava {
    
    public static void main(String[] args, Boolean range2) {
        
    //mendeklarasikan variable
    String nama, alamat;
    int usia;
    Boolean jumlah_gaji;
        
    try (//membuat standar input
    Scanner keyboard = new Scanner(System.in)) {
        //teampilkan judul
        System.out.println("PENDATAAN KARYAWAN");
            
        //nama karyawan
            System.out.println("nama karyawan : ");
            nama = keyboard.nextLine();
            
        //alamat karyawan
            System.out.println("alamat : ");
            alamat = keyboard.nextLine();
            
        //Usia
            System.out.println("Usia : ");
            usia = keyboard.nextInt();
            
            Boolean range1, range3; 

        //  pilihan jumlah gaji
            
            range1 = 1 <4999000;
            range2 = 5000000 <= 9999000;
            range3 = 10000000 < 15000000;
            
        //gaji
            System.out.println("Jumlah gaji:");
            jumlah_gaji = keyboard.nextBoolean();

        if (jumlah_gaji == range1){
            System.out.println("awkwkwk.. satu digit doang");
        } else if (jumlah_gaji == range2){
            System.out.println("lumayan lah, walau masih 1 digit doang.. wkwkwk");
        }else if (jumlah_gaji == range3){
            System.out.println("uiwhh.. gg bat anjir");
        }else {
            System.out.println("salah tulis cuy");
        }
    
    // membuat output
        System.out.println("Nama karyawan: "+ nama);
        System.out.println("Alamat : "+ alamat);
        System.out.println("Usia : "+ usia);
        System.out.println("gaji : "+ jumlah_gaji );
        System.out.println("awokawok.. kasian amat gaji 1 digit");

    
         }  

    }

}
