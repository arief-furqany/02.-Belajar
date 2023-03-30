package BelajarProsedural;

import java.util.Scanner;

public class arrray_input {

    public static void main(String[] args) {
        
System.out.println("membuat program untuk menginputkan nilai kedalaam array dengan scanner");


//Membuat sebuah array yang bernama buah 
//array tersebut memiliki batas indeks 5      
String[] buah = new String[5];

//membuat scanner
Scanner scan = new Scanner(System.in);

//mengisi data ke array
for (int i = 0; i <= buah.length; i++){

    //tidak seperti sebelumnya, setelah pemanggilan variable
    //tidak memasukkan langsung indeks
        System.out.println("buah ke-" + i + ": ");

            //Membuat Scanner untuk array
            buah[i] = scan.nextLine();
    }   

    System.out.println("__________________________________________________");

    for (String b : buah){
        System.out.println(b);
    }

//     Kode di atas merupakan sebuah perulangan `for each` atau `enhanced for loop`
//     pada array `buah`. Pada setiap iterasi, `b` akan menyimpan nilai elemen pada
//     indeks saat ini dari array `buah`. Kemudian nilai `b` akan dikeluarkan ke 
//     konsol melalui `System.out.println(b)`. Berikut adalah penjelasan singkat 
//     tentang bagaimana kode tersebut bekerja:                                         
    
//     1. Kode `for (String b : buah)` mendeklarasikan sebuah variabel `b` yang 
//     bertipe data `String`, lalu mengisi variabel tersebut dengan nilai dari
//     setiap elemen pada array `buah`.
    
//     2. Kemudian kode `{` dan `}` di dalam kurung kurawal `{}` akan mengeksekusi 
//     semua instruksi yang ada di antara keduanya pada setiap iterasi dari `for` 
//     loop.
    
//     3. Pada setiap iterasi, nilai dari variabel `b` akan dicetak ke konsol 
//     melalui perintah `System.out.println(b)`.
    
//     4. Ketika seluruh elemen dari array `buah` telah diproses, maka perulangan 
//     akan selesai."
// "

    }
}
