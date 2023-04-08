package BelajarProsedural;

public class Fungsi1 {

    public static void main (String[] args){

        //nilai yang akan digunakan oleh fungsi.

                     //nama() adalah fungsi yang dipanggil
        String nama = nama("arief ","furqany");
        String nama2 = nama("arie", "kanoy");

        int hasil = aritmatika(6,8,9);
        int hasil2 = aritmatika(12, 8, 16);


        // pemanggilan fungsi
        System.out.println(nama);
        System.out.println(nama2);
        System.out.println(hasil);
        System.out.println(hasil2);
    }


//pembuatan fungsi 

//fungsi sebaiknya digunakan diluar main scope agar berfungsi secara global
//tentukan tipe data kembalian -> nama fungsi -> tipe data parameter

    //contoh kode untuk mengembalikan nilai integer.
    public static int aritmatika(int a, int b, int c){

    //int "nama_fungsi" = tipe data nama fungsi yang mengembalikan nilai berupa integer
    // (int a, int b) = parameter (nilai yang diterima fungsi sebagai masukan/variable tersedia)
    
        int hasil = a + b * c;

        // return berguna untuk mencetak nilai dari program dalam fungsi ketika si fungsi dipaggil
        return hasil;
    }
    

//contoh kode dengan nilai kembalian String
    public static String nama(String nm_depan, String nm_belakang){

        String nama_lengkap = nm_depan + nm_belakang; 

        // return berguna untuk mencetak nilai dari program dalam fungsi ketika si fungsi dipaggil
        return nama_lengkap;
    }

}