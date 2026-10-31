package com.mycompany.tugaspbo_soal4;

import java.util.ArrayList;

class Pemeriksaan {
    private String namaPasien;
    private String jenisPemeriksaan;
    private double biaya;

    // Constructor
    Pemeriksaan(String namaPasien, String jenisPemeriksaan, double biaya) {
        this.namaPasien = namaPasien;
        this.jenisPemeriksaan = jenisPemeriksaan;
        this.biaya = biaya;
    }

    // Method menampilkan data
    void tampilData() {
        System.out.println("Nama Pasien       : " + namaPasien);
        System.out.println("Jenis Pemeriksaan : " + jenisPemeriksaan);
        System.out.println("Biaya             : Rp" + biaya);
        System.out.println("-----------------------------");
    }

    // Method mengambil biaya
    double getBiaya() {
        return biaya;
    }
}

public class TugasPBO_soal4 {

    public static void main(String[] args) {

        ArrayList<Pemeriksaan> daftarPemeriksaan = new ArrayList<>();

        // Membuat 3 objek pemeriksaan
        daftarPemeriksaan.add(
            new Pemeriksaan("Ani", "Pemeriksaan Umum", 50000)
        );

        daftarPemeriksaan.add(
            new Pemeriksaan("Budi", "Tes Darah", 100000)
        );

        daftarPemeriksaan.add(
            new Pemeriksaan("Citra", "Pemeriksaan Mata", 75000)
        );

        double totalBiaya = 0;

        System.out.println("DATA PEMERIKSAAN KLINIK");
        System.out.println("=============================");

        // Perulangan untuk menampilkan data
        for (Pemeriksaan p : daftarPemeriksaan) {
            p.tampilData();
            totalBiaya += p.getBiaya();
        }

        System.out.println("Total Seluruh Biaya: Rp" + totalBiaya);
    }
}