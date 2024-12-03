package com.tutorial;

// Keywords
import com.terminal.Console;

class Main{
    public static void main(String[] args) {
        System.out.println("\nHelllo ADM");

        Player player1 = new Player("udin");
        Player player2 = new Player("Budi");
        
        player1.cetak();
        player2.cetak();

        Console.log("\nHALLO");
        Console.log("APA YANG KAMU LAKUKAN DISINI");
        Console.log("KELUARR!!!!");

    }
}
