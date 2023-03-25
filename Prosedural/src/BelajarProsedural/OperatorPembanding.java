package BelajarProsedural;

public class OperatorPembanding{

    public static void main(String[] args) {
        System.out.println("Operator Pembanding");

        //Nilaidari operator pembanding adalah true dan false
        // contoh : 

        int a, b;
        boolean hasil;

        a = 20;
        b = 30;

        //Lebih besar dari
        hasil = a > b;
        System.out.println(hasil);

        //Lebih kecil dari
        hasil = a < b;
        System.out.println(hasil);

        //lebih kecil sama dengan
        hasil = a <= b;
        System.out.println(hasil);

        //lebih besar sama dengan
        hasil = a >= b;
        System.out.println(hasil);

        //Sama dengan
        hasil = a == b;
        System.out.println(hasil);

        //tidak sama dengan
        hasil = a != b;
        System.out.println(hasil);

    }
}