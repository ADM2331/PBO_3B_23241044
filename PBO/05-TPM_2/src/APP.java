// 01-Membuat class
class PersgiPanjang{

    Double panjang;
    Double lebar;

// 02-Construktor  (atribut)
    PersgiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
// 03-Menghitung Luas dan Keliling
    // Hitung Luas
    Double luas(){
        return panjang * lebar;
    }
    //Hitung Keliling
    double keliling() {
        return 2 * (panjang + lebar);
    }
// 04-Mencetak Hasil  
    //Cetak hasil
    void cetakHasil(){
        System.out.println("*******************************************");
        System.out.printf("Luas Persegi panjang : %.2f%n", luas());
        System.out.printf("Keliling Persegi Panjang %.2f%n", keliling());
        System.out.println("*******************************************");
    }
// 05-Setting Panjang dan Lebar
    // Setting Panjang
    void  setPanjang( double panjang){
        this.panjang = panjang;
    }
    // Setting Lebar    
    void setLebar(double lebar){
        this.lebar = lebar;
    }
}

public class APP{
    public static void main(String[] args) {

// 06-Membuat Objek    
        PersgiPanjang persPanjang = new PersgiPanjang(10, 3);

// 07-Memanggil Hasil
        persPanjang.cetakHasil();

// 08-Memanggil setting Panjang,Lebar
        persPanjang.setPanjang(10);
        persPanjang.setLebar(3);
        persPanjang.cetakHasil();
    }
}
