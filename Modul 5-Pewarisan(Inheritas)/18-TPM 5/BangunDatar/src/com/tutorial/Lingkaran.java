package com.tutorial;

public class Lingkaran extends BangunDatar{
    float r;

    Lingkaran(float r){
        this.r = r;
    }

    // Overread
    public float luas(){
        return (float) (Math.PI * r * r);        
    }
    public float keliling(){
        return (float) (2 * Math.PI * r);
    }
    
    void cetak(){
        System.out.println("\nLINGKARAN" );
        System.out.println("Luas     : " + luas() );
        System.out.println("keliling : " + keliling() );
    }        
}
