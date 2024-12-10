package com.tutorial;

public class HeroTank extends Hero {

    // atribut 
    String atribut = "Tank";

    //Construktor didalam subclass
    public HeroTank(String nama, double defence, double attact) {
        super(nama, defence, attact);
        
    }
    
    //Overriding
    void cetak(){
        System.out.println("Hero : " + this.atribut);
        super.cetak();
    }
   
}
