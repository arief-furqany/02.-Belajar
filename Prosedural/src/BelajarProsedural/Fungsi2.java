package BelajarProsedural;
import java.util.Scanner;

public class Fungsi2 {

    static Scanner InputData = new Scanner(System.in);
   
    public static void main(String[] args) {
        System.out.println("hitung luas");

        int i,j;

        for(i = 0; i < panjang(6); i++ ){
            for (j = 0; j < lebar(4); j++){
                System.out.println("*");
            }
            System.out.println(""); 
        } 
        
    }
//Fungsi untuk mengambil input dari user berupa integer dan mengembalikan nilai
    public static int lebar(int lebar){

        return lebar;
    }
    
    public static int panjang(int panjang) {
 
        return panjang;
    }
}
