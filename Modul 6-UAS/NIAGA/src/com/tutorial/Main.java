package com.tutorial;
// Sebuah retail bernama NIAGA memiliki banyak pelanggan, terdapat pelanggan
// yang memiliki kartu member dan ada pelanggan yang tidak memiliki.
// Jika seorang pelanggan memiliki kartu member dan belanja diatas 500.000 maka
// pelanggan tersebut mendapatkan potongan belanja sebanyak 10%. Sementara jika
// belanjanya diatas 100.000 dan dibawah 499.999 maka hanya mendapatkan potongan
// belanja 5%,dan jika belanja dibawah 100.000 mendapatkan potongan 3%.
// Sementara itu jika pelanggan tanpa kartu member belanja diatas 100.000 maka
// mendapatkan potongan 3%. Buatlah program dari kasus diatas dengan ketentuan:
// 1.⁠ ⁠Total Belanja = Total Belanja – (Total Belanja * potongan).
// 2.⁠ ⁠Potongan belanja tidak boleh diubah-ubah (Private).
// 3.⁠ ⁠Tampilkan nama pelanggan, status kepemilikan kartu member,
// Total Belanja Sebelum potongan, Diskon (dalam Persen), Diskon (Dalam Rupiah),
// Total Belanja Setelah Potongan.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hi ADM");

        // Pelanggan dengan Kartu Member yang belanja di atas Rp500.000 dpt diskon 10%.
        Pelanggan pelanggan1 = new Member("Budi", 600000);
        // Pelangga dengan Kartu Member yang belanja di atas 100.000 dan dibawah 499.000 mendapat diskon 5%.
        Pelanggan pelanggan2 = new Member("Boni", 150000);
        // Pelanggan dengan Kartu Membr yang belanja di bawah Rp100.000 mendapatkan diskon 3%. 
        Pelanggan pelanggan3 = new Member("Chely", 80000);
        // Pelanggan tanpa Kartu Member yang belanja diatas Rp100.000 mendapatkan diskon 3%.
        Pelanggan pelanggan4 = new NonMember("Ridho", 200000);

        System.out.println("---------------------------");
        pelanggan1.hitungTotal();
        System.out.println("---------------------------");
        pelanggan2.hitungTotal();
        System.out.println("---------------------------");
        pelanggan3.hitungTotal();
        System.out.println("---------------------------");
        pelanggan4.hitungTotal();
    }
    
}
