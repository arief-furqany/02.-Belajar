

public class Pengulangan{


    public static void main(String[] args) {
        System.out.println(" Ini adalah pengulangan");

        //Pengulangan Terhitung
        for (int hitungan = 0; hitungan <= 10; hitungan++ ){
            // Pengulangan akan terus mengurlang kode dari atas kebawah 
            //dalam kurung keriting.
        System.out.println("ini adalah pengulangan terhitung");
        System.out.println(hitungan + " ");
        }


        //Pengulangan tak terhitung(kode di jadikan komentar agar tidak terjadi infinity loop)
        //for (int tak_terhitung = 0; tak_terhitung ++);

        //Ini adalah contoh dari pengulangan angka ganjil saja
        for (int i = 0; i <= 10; i += 2){
            System.out.println(i + " ");
        }   
    }
}