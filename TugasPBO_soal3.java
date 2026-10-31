package com.mycompany.tugaspbo_soal3;

class MenuKafe {
    String namaMenu;
    double harga;

    // Constructor tanpa parameter
    MenuKafe() {
        this.namaMenu = "Menu Belum Dipilih";
        this.harga = 0;
    }

    // Constructor dengan parameter
    MenuKafe(String namaMenu, double harga) {
        this.namaMenu = namaMenu;
        this.harga = harga;
    }

    // Method overloading pertama
    double hitungHarga(int jumlah) {
        return harga * jumlah;
    }

    // Method overloading kedua
    double hitungHarga(int jumlah, double diskon) {
        double total = harga * jumlah;
        return total - (total * diskon / 100);
    }

    void tampilData() {
        System.out.println("Nama Menu : " + namaMenu);
        System.out.println("Harga     : Rp" + harga);
        System.out.println("-------------------------");
    }
}

public class TugasPBO_soal3 {

    public static void main(String[] args) {

        MenuKafe menu1 = new MenuKafe();
        MenuKafe menu2 = new MenuKafe("Nasi Goreng", 15000);
        MenuKafe menu3 = new MenuKafe("Es Teh", 5000);

        menu1.tampilData();
        menu2.tampilData();
        menu3.tampilData();

        System.out.println("Total Nasi Goreng (2 porsi): Rp"
                + menu2.hitungHarga(2));

        System.out.println("Total Nasi Goreng (2 porsi, diskon 10%): Rp"
                + menu2.hitungHarga(2, 10));
    }
}