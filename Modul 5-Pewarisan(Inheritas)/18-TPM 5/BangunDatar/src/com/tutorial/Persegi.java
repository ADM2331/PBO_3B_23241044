package com.tutorial;

public class Persegi extends BangunDatar {
    float sisi;
    
    Persegi(float sisi) {
        this.sisi = sisi;
    }

    // Ovrride
    public float luas(){
        return sisi * sisi;
    }

    public float keliling(){
        return 4 * sisi;
    }

    void cetak(){
        System.out.println("\nPEREGI ");
        System.out.println("Luas     : " + luas());
        System.out.println("keliling : " + keliling());
    }        
}
