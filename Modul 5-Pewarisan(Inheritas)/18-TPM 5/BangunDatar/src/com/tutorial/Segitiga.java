package com.tutorial;

public class Segitiga extends BangunDatar{
    float alas;
    float tinggi;

    Segitiga(float alas, float tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Override
    public float luas(){
       return (alas * tinggi) / 2;
    }
    public float keliling(){
        return 3 * alas;
    }

    void cetak(){
        System.out.println("\nSEGITIGA");
        System.out.println("Luas     : " + luas());
        System.out.println("Keliling : " + keliling());
    }    
}
