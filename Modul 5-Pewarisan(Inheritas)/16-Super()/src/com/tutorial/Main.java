package com.tutorial;

public class Main {
    public static void main(String[] args) {

        Hero hero1 = new Hero();

        //Membuat objek dari suubclass
        HeroTank hero2 = new HeroTank();
        

        hero1.cetak();
        hero2.cetak();
    }
    
}
