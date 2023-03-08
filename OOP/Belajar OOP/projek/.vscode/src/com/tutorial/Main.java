package com.tutorial;



public class Main {
    public static void main(String[] args) {
        Main mhs = new Main();       
    }

    //membuat Class / template
    public static class Mahasiswa {
       private String nama;
       private String NIM;
       private String jurusan;
    
        //inner class bersifat public, jadi bisa di akses dari luar class
        public Mahasiswa(String nama, String nIM, String jurusan, String alumni) {
            this.nama = nama;
            NIM = nIM;
            this.jurusan = jurusan;
            alumni = Alumni;
        }

        public String getAlumni(){
            return Alumni;
        }

        public String getNama() {
            return nama;
        }

        public String getNIM() {
            return NIM;
        }

        public String getJurusan() {
            return jurusan;
        }

        public Mahasiswa() {
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public void setNIM(String nIM) {
            NIM = nIM;
        }

        public void setJurusan(String jurusan) {
            this.jurusan = jurusan;
        }

        public Mahasiswa(String jurusan) {
            this.jurusan = jurusan;
        }

        

        
    
    }
    
    // Mahasiswa(String InputNama, String InputNIM, String InputJurusan);
    // nama = InputNama;
    // nim = InputNIM;
    // jurusan = InputJurusan;
    
}
