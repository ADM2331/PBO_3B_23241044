package com.tutorial;

import com.terminal.Console;
import static com.terminal.Console.log;


class Main{
    public static void main(String[] args) {
        System.out.println("\nHELLO ADM");

        Player player1 = new Player("ADM");
        Player player2 = new Player("ADM2");

        player1.cetak();
        player2.cetak();

        Console.log("\nMenampilkan data dari Console");

        Console.log("Player Name = " + player1.getName());
        log("apakah bisa?");

    System.out.println( );

    }
}