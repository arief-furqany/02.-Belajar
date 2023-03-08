package com.tutorial.humas;

import com.tutorial.Main;

/**
 * Jurusan
 */
public class Jurusan {

    public static void main(String[] args) {

       Main.Mahasiswa mhs2 = new Main.Mahasiswa("Teknoogi Informasi");

       mhs2.setJurusan("Biologi");
       
       System.out.println(mhs2.getJurusan());

    }
}