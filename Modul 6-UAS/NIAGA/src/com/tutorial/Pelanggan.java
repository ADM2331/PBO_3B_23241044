package com.tutorial;

public class Pelanggan {
    // Atribut
    private String nama;
    private double totalBelanja;

    // Konstruktor
    public Pelanggan(String nama, double totalBelanja) {
        this.nama = nama;
        this.totalBelanja = totalBelanja;
    }

    // Method
    public void hitungTotal(){}
    
     void tampilkanDetail(double diskonPersen, double diskonRupiah, double totalSetelahPotongan, boolean Member){
        System.out.println("Nama Pelanggan                 : " + nama);
        System.out.println("Status Member                  : " + (Member ? "Ya" : "Tidak"));
        System.out.println("Total Belanja Sebelum Potongan : Rp " + totalBelanja );
        System.out.println("Diskon (Persem)                : " + diskonPersen + "%");
        System.out.println("Diskon (Rupiah)                : Rp " + diskonRupiah);
        System.out.println("Total Belanja Setelah Potongan : Rp " + totalSetelahPotongan);
    }

    double getTotalBelanja(){
        return totalBelanja;

    }   
}
