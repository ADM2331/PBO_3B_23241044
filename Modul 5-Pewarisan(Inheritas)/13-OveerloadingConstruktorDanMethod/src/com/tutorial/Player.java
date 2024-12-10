package com.tutorial;

public class Player {
    // Atribut
    private String name;
    private static int jumlahPlayer;

    // Construktor
    // opsi 1 untuk membuat objek ()
    Player(String name){
        Player.jumlahPlayer++;
        this.name = name;
    }
    
    // Ovrloading Construktor
    // opsi 2 untuk membuat objek
    public Player() {
        Player.jumlahPlayer++;
        this.name = "Player" + Player.jumlahPlayer;
    }    
    
    // Method
    void Cetak(){
        System.out.println("Name : " + this.name);
    }
}
