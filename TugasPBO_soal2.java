package com.mycompany.tugaspbo_soal2;

class Sepeda {
    private String kodeSepeda;
    private String jenisSepeda;
    private int lamaSewa;
    private double hargaPerJam;

    Sepeda(String kodeSepeda, String jenisSepeda,
           int lamaSewa, double hargaPerJam) {
        this.kodeSepeda = kodeSepeda;
        this.jenisSepeda = jenisSepeda;
        this.lamaSewa = lamaSewa;
        this.hargaPerJam = hargaPerJam;
    }

    double hitungBiaya() {
        return lamaSewa * hargaPerJam;
    }

    void tampilData() {
        System.out.println("Kode Sepeda : " + kodeSepeda);
        System.out.println("Jenis Sepeda: " + jenisSepeda);
        System.out.println("Lama Sewa   : " + lamaSewa + " jam");
        System.out.println("Harga/Jam   : Rp" + hargaPerJam);
        System.out.println("Total Biaya : Rp" + hitungBiaya());
        System.out.println("-------------------------");
    }
}

public class TugasPBO_soal2 {
    public static void main(String[] args) {
        Sepeda sepeda1 = new Sepeda(
            "S001", "Sepeda Gunung", 3, 10000
        );

        Sepeda sepeda2 = new Sepeda(
            "S002", "Sepeda Lipat", 5, 8000
        );

        sepeda1.tampilData();
        sepeda2.tampilData();
    }
}