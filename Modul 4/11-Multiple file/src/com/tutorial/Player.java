package com.tutorial;

class Player{
    private String nama;

    Player(String nama){
        this.nama = nama;
    }
    
    void cetak(){
        System.out.println("Nama = " + this.nama);
    }
   
}