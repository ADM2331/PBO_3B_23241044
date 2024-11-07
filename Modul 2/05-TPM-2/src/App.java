// Membuat Class
class PrsegiPanjang{

// Data Member
double panjang;
double lebar;

// Construktor (atribut dari class PrsegiPanjang)
PrsegiPanjang(double panjang, double lebar){
    this.panjang = panjang;
    this.lebar = lebar;
}

// Menghitung Luas dan Keliling
double hitungLuas(){
    return panjang * lebar;
}
double hitungkeliling(){
    return 2 * (panjang + lebar);
}

// Mencetak Hasil dari class PrsegiPanjang
void cetakHasil(){
    System.out.println("=====================================");
    System.out.println("Luas Persegi Panjang : " + hitungLuas());
    System.out.println("keliling Persegi Panjang : " + hitungkeliling());
    System.out.println("=====================================");
}
// setting panjang
void setPanjang(double panjang){
    this.panjang = panjang;
}
// setting Lebar
void setLebar(double lebar){
    this.lebar = lebar;
}

}
public class App {
    public static void main(String[] args) throws Exception {
        
        PrsegiPanjang hitung = new PrsegiPanjang(10, 3);
        // Memanggil cetakHasil
        System.out.println(" ");
        System.out.println("Nilai Awal :");
        hitung.cetakHasil();
        
        System.out.println(" ");
        // Tempat setting Panjang Lebar
        hitung.setPanjang(20);
        hitung.setLebar(6);
        System.out.println("Nilai yang sudah di Setting :");
        hitung.cetakHasil();


    }
}
