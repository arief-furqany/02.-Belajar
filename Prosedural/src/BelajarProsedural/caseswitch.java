package BelajarProsedural;

import java.util.Scanner;

public class caseswitch {


/// Switch case biasanya digunakan dalam pemilihan menu

    public static void main (String [] args){

        Scanner inputnilai = new Scanner(System.in);

        System.out.println(" Ini adalah Switch Case");
        System.out.println("");

        System.out.println("nama lu siapa sih bro?");
        String nama = inputnilai.next();


        //ini adalah ekspresi, biasa dinyatakan dalam bentuk variable
        switch (nama) {

            //ini adalah case, percabangan ke -....
            case "arief":

                //ini adalah statement atau program yang akan dijalankan jika berada di case yag sama
                System.out.println("lu sok asik masbro");

                //ini adalah perintah agar jika ekspresi bernilai true untuk segera berhenti memeriksa yang lain
                break;

            //ini adalah contoh case yang lainnya
            case "udin":
                System.out.println("widiiih udiinnn");
                break;
            
            //case default adalah jika tida ada yang bernilai true di case sebelumnya
            default:
                System.out.println("ghehj : oalaa.. gak kenal ");
                break;
        }


    }

}