package com.tutorial;

public class HeroTank extends Hero {

    //
    double defencePower;

    //
    void cetak(){
        System.out.println("\nHero dari subclass");
        System.out.println("Hero Tank");
        System.out.println("Hero Name : " + this.name);
        System.out.println("Deffence Power : " + this.defencePower);
    }
    
}
