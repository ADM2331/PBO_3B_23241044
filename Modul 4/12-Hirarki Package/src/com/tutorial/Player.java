package com.tutorial;

import com.terminal.Console;


class Player {
    // Variable Objek
    private  String nama;

    // Konstruktor
    public Player(String nama) {
        this.nama = nama;
    }

    // METHOD CETAK
    void cetak(){
        System.out.println("PLAYER NAMA = " + this.nama);
        
        Console.log("dari Console");
    }

    //Method Getter
    String getName(){
        return this.nama;
    }
       
}
