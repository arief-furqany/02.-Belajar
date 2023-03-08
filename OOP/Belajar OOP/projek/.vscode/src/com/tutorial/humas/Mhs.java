package com.tutorial.humas;

import com.tutorial.Main;

/**
 * Mhs
 */
public class Mhs {

    public static void main(String[] args) {
        Main.Mahasiswa mhs = new Main.Mahasiswa();

        // ("arief", "220705043","it");
       System.out.println( mhs.getNama());
       mhs.setNama("arief aja");
       System.out.println(mhs.getNama());

    }
}