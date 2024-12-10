package com.tutorial;


public class Hero {
    // atribut 
    String nama;
    double defencePower;
    double attectPower;

    //onstruktor
    Hero(String nama, double defencePower, double attectPower){
        this.nama = nama;
        this.defencePower = defencePower;
        this.attectPower = attectPower;


    }

    void cetak(){
        System.out.println("Nama : " + nama);
        System.out.println("Deffance Power : " + defencePower );
        System.out.println("Attect Power   : " + attectPower );

    }
    
    
}
