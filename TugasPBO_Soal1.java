package com.mycompany.tugaspbo_soal1;

class Buku {
    String kodeBuku;
    String judul;
    String penulis;
    double harga;

    Buku(String kodeBuku, String judul,
         String penulis, double harga) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    void tampilData() {
        System.out.println("Kode Buku : " + kodeBuku);
        System.out.println("Judul     : " + judul);
        System.out.println("Penulis   : " + penulis);
        System.out.println("Harga     : Rp" + harga);
        System.out.println("----------------------");
    }
}

    public class TugasPBO_Soal1 {
    public static void main(String[] args) {
        Buku buku1 = new Buku(
            "B001", "Pemrograman Java", "Andi", 85000
        );

        Buku buku2 = new Buku(
            "B002", "Dasar Algoritma", "Budi", 75000
        );

        buku1.tampilData();
        buku2.tampilData();
    }
}