public class belajar_variable {

    public static void main(String[] args) {

        // String adalah untuk tipe data huruf, kalimat
        String nama = ("Muhammad arief furqany");

        // int adalah Integer, deklarasi variable untuk tipe data angka bulat
        int nim = 220705043;

        // Boolean adalah deklarasi untuk variable yang memiliki nilai benar atau salah
        Boolean hujan = true;

        // Double adalah tipe data yang menampung nilai desimal
        Double a = 70.8;

        // Float adalah tipe data yang menampug nilai desimal dengan luas tampunan lebih
        // banyak daripada Double
        Float b = 3.7f;

        // Char adalah tipe data yang hanya bisa menampung data huruf, dan hanya satu
        // huruf
        char c = 'd';

        System.out.println(nama + " " + nim);
        System.out.println("ini adalah tipe data boolean yang bernilai: " + hujan);
        System.out.println("ini adalah tipedata double dikali dengan Float: " + a * b);
        System.out.println("ini adalah tipe data Char: " + c);

    }

}