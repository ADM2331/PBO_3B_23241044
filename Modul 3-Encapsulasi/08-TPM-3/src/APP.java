class Hitung_Gaji_Bersih{
// Data member
private int Gaji_Pokok;
private int Tunjangan;
private double Pajak;

//Construktor
public Hitung_Gaji_Bersih(){

this.Gaji_Pokok = 0;
this.Tunjangan = 0;
this.Pajak = 0;
    
}
// 01-S&G Gaji_Pokok
public void setGaji_Pokok(int nilai1){
    this.Gaji_Pokok = nilai1;
}
public int getGaji_Pokok(){
    return this.Gaji_Pokok;
}

// 02-S&G Tunjangan
public void setTunjangan(int nilai2){
    this.Tunjangan = nilai2;
}
public int getTunjangan(){
    return this.Tunjangan ;
}

//03-S&G Pajak
public void setPajak(double nilai3){    
    this.Pajak = nilai3;
}
public double getPajak(){
    return this.Pajak = (this.Gaji_Pokok + this.Tunjangan) * this.Pajak / 100;
}

// Untuk MENCETAK
void CetakGajiBersih(){
System.out.println("\nGaji Pokok           : Rp " + this.Gaji_Pokok);
System.out.println("Tunjangan            : Rp " + this.Tunjangan);
System.out.println("Presentase Pajak     : % " + this.Pajak);
System.out.println("Pajak dlm Rp         : Rp " + (this.Gaji_Pokok + this.Tunjangan) * this.Pajak / 100);



System.out.println("------------------------------------");
System.out.println("Total Gaji Bersih : Rp ");
System.out.println( (Gaji_Pokok + Tunjangan) - getPajak() );
System.out.println("------------------------------------");
    }
}

public class APP {
    public static void main(String[] args) throws Exception {
        
        // instansiasi objek
        Hitung_Gaji_Bersih Gaji = new Hitung_Gaji_Bersih();
    
    // 01-Setter Gaji_Pokok (MENULIS/ Tempat setting nilai)
    Gaji.setGaji_Pokok(5000000);
    //Getter(Membaca only) Gaji_Pokok 
        // int BC1 = Gaji.getGaji_Pokok();
        // System.out.println("Gaji Pokok      : Rp " + BC1); 
    
    // 02-Setter TUNJANGAN (MENULIS/ Tempat setting nilai)
    Gaji.setTunjangan(1000000);
    //Getter(Membaca only) Gaji_Pokok 
        // int BC2 = Gaji.getTunjangan();
        // System.out.println("Tunjangan       : Rp " + BC2);
    
    // 03-Setter Pajak (MENULIS/ Tempat setting nilai)
    Gaji.setPajak(50);
    //Getter(Membaca only) Gaji_Pokok 
        // double BC3 = Gaji.getPajak();
        // System.out.println("Pajak           : RP " + BC3);

    
    Gaji.CetakGajiBersih();

    }
}