package com.tutorial;

public class Main {
    public static void main(String[] args) {

        Hero hero1 = new Hero();
        hero1.name = "jokoi";
        hero1.cetak();

        // membuuat objek dari subclass
        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Bowo";
        
        hero2.cetak();

        //
        HeroIntel Hero3 = new HeroIntel();
        Hero3.name = "Ganjur";

        Hero3.cetak();
        
        
    }
}
