package BelajarProsedural;

public class array_latihan {

    public static void main(String[] args) {
        System.out.println("Latihan array according petanicode");

        //contoh looping array
        String[] loop_array = {"arief", "arip", "kanoy" };

    // berikut adalah kode untuk menggunakan sebuah array secara terus menerus
    //menggunakan perulangan dalah solusi untuk print semua indeks array
    // .lenght adalah fungsi untuk menghitung lenght dari array

    for (int i = 0; i <= loop_array.length; i++)
        
        // + loop_array[i] = berfungsi untuk memberitahukan mesin bahwa kita akan 
        // melakukan print kepada seluruh isi indeks 
        System.out.println("indeks ke -" + i +" : "+ loop_array[i]);
    
    
    }
}
