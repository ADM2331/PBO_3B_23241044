package com.tutorial;

public class NonMember extends Pelanggan {
    // Atribut
    private double PotonganNonMember = 0.03;

    // Konstuktor
    NonMember(String nama, double totalBelanja){
        super(nama, totalBelanja);
    }
    // Method
    public void hitungTotal(){
        double potongan = getTotalBelanja() >= 100000 ? PotonganNonMember : 0;        
        double diskon = getTotalBelanja() * potongan;
        double totalSetelahPotongan = getTotalBelanja() - diskon;

        tampilkanDetail(potongan * 100, diskon, totalSetelahPotongan, false);

    }    
}
