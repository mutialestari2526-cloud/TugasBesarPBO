package com.mycompany.tugaspbo_soal5;

import java.util.ArrayList;

class Tiket {
    private String namaFilm;
    private String namaPembeli;
    private int jumlahTiket;
    private double hargaTiket;

    // Constructor
    Tiket(String namaFilm, String namaPembeli,
          int jumlahTiket, double hargaTiket) {
        this.namaFilm = namaFilm;
        this.namaPembeli = namaPembeli;
        this.jumlahTiket = jumlahTiket;
        this.hargaTiket = hargaTiket;
    }

    // Method menghitung total harga
    double hitungTotal() {
        return jumlahTiket * hargaTiket;
    }

    // Method menampilkan data tiket
    void tampilData() {
        System.out.println("Nama Film     : " + namaFilm);
        System.out.println("Nama Pembeli  : " + namaPembeli);
        System.out.println("Jumlah Tiket  : " + jumlahTiket);
        System.out.println("Harga Tiket   : Rp" + hargaTiket);
        System.out.println("Total Harga   : Rp" + hitungTotal());
        System.out.println("-----------------------------");
    }
}

public class TugasPBO_soal5 {

    public static void main(String[] args) {

        ArrayList<Tiket> daftarTiket = new ArrayList<>();

        // Membuat 3 objek tiket
        daftarTiket.add(
            new Tiket("Avengers", "Ani", 2, 50000)
        );

        daftarTiket.add(
            new Tiket("Frozen", "Budi", 3, 40000)
        );

        daftarTiket.add(
            new Tiket("Doraemon", "Citra", 1, 45000)
        );

        double totalPendapatan = 0;

        System.out.println("DATA PEMESANAN TIKET BIOSKOP");
        System.out.println("=============================");

        // Perulangan menampilkan semua tiket
        for (Tiket t : daftarTiket) {
            t.tampilData();
            totalPendapatan += t.hitungTotal();
        }

        System.out.println("Total Pendapatan: Rp" + totalPendapatan);
    }
}