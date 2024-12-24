package com.tutorial;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello ADM");

        BangunDatar persegi = new Persegi(5);
        persegi.cetak();
System.out.println("-----------------------");

        BangunDatar Lingkaran = new Lingkaran(5);
        Lingkaran.cetak();
System.out.println("-----------------------");

        BangunDatar PersegiPanjang = new PersegiPanjang(10, 5);
        PersegiPanjang.cetak();
System.out.println("----------------------");

        BangunDatar Segitiga = new Segitiga(10, 8);
        Segitiga.cetak();
System.out.println("-----------------------");

    }
    
}
