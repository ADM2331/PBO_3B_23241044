package com.tutorial;

public class PersegiPanjang extends BangunDatar {
    float panjang;
    float lebar;

    PersegiPanjang(float panjang, float lebar){
        this.panjang = panjang;
        this.lebar = lebar;

    }
        // Override
        public float luas(){
            return panjang * lebar;
        }
        public float keliling(){
            return 2 * (panjang + lebar);
        }
        
        void cetak(){
            System.out.println("\nPERSEGI PANJANG");
            System.out.println("Luas     : " + luas());
            System.out.println("Keliling : " + keliling());        
    }    
}
