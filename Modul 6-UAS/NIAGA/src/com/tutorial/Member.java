package com.tutorial;

public class Member extends Pelanggan{
    // Atribut
    private double PotonganMember_10 = 0.10;
    private double PotonganMember_5  = 0.05;
    private double PotonganMember_3  = 0.03;

    // Konstruktor
    Member(String nama, double totalBelanja) {
        super(nama, totalBelanja);
    }
    // Method
    public void hitungTotal(){
        double potongan;
        if (getTotalBelanja() > 500000){
            potongan = PotonganMember_10;
        }else if (getTotalBelanja() >= 100000){
            potongan = PotonganMember_5;
        }else{
            potongan = PotonganMember_3;
        }

        double diskon = getTotalBelanja() * potongan;
        double totalSetelahPotongan = getTotalBelanja() - diskon;

      tampilkanDetail(potongan * 100, diskon, totalSetelahPotongan, true);
    }
}
