package com.tutorial;

public class HeroTank extends Hero{

    // atribut baru
    String nama = "Class Hiro Tank";

    // Overreding method
    void cetak(){
        System.out.println("Ini adalah " + this.nama);
        this.dummyMethod();
    }
    
}
