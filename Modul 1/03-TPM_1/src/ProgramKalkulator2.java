import java.util.Scanner;                                  // Mengimpor kelas scanner dari paket java.util, yang di gunakan untuk membaca input dari pengguna

public class ProgramKalkulator2 {                           //mendeklarasikan atau membuat class publik brnama ProgramKalkulator2.
    private double no1;                                     //mendeklarasikan 3 variable instan : no1 dan no2 untuk menyimpan bilangan bertipe double,
    private double no2;
    private char operator;                                  //oprator untuk menyimpan jenis oprasi seperti(*,/,+,-) bertipe char.
    // KONSTRUKTOR
    public ProgramKalkulator2(char operator) {              //Mendeklarasikan konstruktor untuk kelas ProgramKalkulator yang menerima satu parameter oprator. Parameter ini di gunakan untuk menginisialisasi variable instan oprator.
        this.operator = operator;
    }
    public void setBilangan(double no1, double no2) {       // Metode setBilangan di gunakan untuk mengatur nilai no1 dari no2 dari luar kelas.
        this.no1 = no1;
        this.no2 = no2;
    }
    public double hitung() {                      // Mendeklarasikan mtode hitung yang mengembalikan nilai bertipe double. Variabel hasil diinisialisasi dengan 0.
        double hasil = 0;        
        switch (operator) {                      // Memulai blok switch untuk menentukan oprasi matematika berdasarkan nilai oprator.

            case '+':                            // dari baris 31 sampai 39 menerangkan: jika oprator adalah (*,/,+,-) maka di hitung sebagai penjumlahan dari no1 dan no2.
                hasil = no1 + no2;
                break;
            case '-':
                hasil = no1 - no2;
                break;
            case '*':
                hasil = no1 * no2;
                break;
            
            case '/':                              // khusus untuk pembagian: Jika operator adalah '/', kode memeriksa apakah no2 tidak sama dengan 0. Jika tidak, maka hasil dihitung sebagai pembagian no1 dengan no2. Jika no2 adalah 0, pesan kesalahan ditampilkan, dan metode mengembalikan NaN (Not a Number).
                if (no2 != 0) {
                    hasil = no1 / no2;
                } else {
                    System.out.println("Kesalahan: Pembagi tidak boleh nol.");
                    return Double.NaN;                           // Kembalikan NaN jika terjadi kesalahan
                }
                break;
            default:                                             // Jika oprator tidak di kenali, maka pesan kesalahan akan di tampilkan, dan metode mengembalikan NaN.
                System.out.println("Operasi tidak valid.");
                return Double.NaN;                               // Kembalikan NaN jika operasi tidak valid
        }        
        return hasil;                                            // Mengembalikan nilai hasil yang telah di hitung.
    }
    public static void main(String[] args) {                                       // Metode main, Titik masuk program
        Scanner scanner = new Scanner(System.in);                                  //membuka objek scanner untuk membaca input dari pengguna.

        System.out.println("-----------------------------------------------");
        System.out.println("Pilih operasi: *, /, +, -");                         //Menampilkan mnu pilihan oprasi yang akan di lakukan kpada pengguna
        System.out.println("-----------------------------------------------");
        System.out.println(" ");

        char operator = scanner.next().charAt(0);                           // Membaca satu karakter dari input pengguna dan menyimpannya dalam variabel oprator        
        boolean lanjut = true;                                                    // mendeklarasikan variabel bolean lanjut untuk mengontrol loop(perulangan).
        while (lanjut) {                                                          //Memulai loop yang akan trus berjalan selama lanjut bernilai true.

            System.out.print("Masukkan bilangan pertama: "); 
            double no1 = scanner.nextDouble();
            System.out.print("Masukkan bilangan kedua: ");  
            double no2 = scanner.nextDouble();

            ProgramKalkulator2 kalkulator = new ProgramKalkulator2(operator);    // Membuat objek kalkulator dari kelas ProgramKalkulator2 dengan oprator yang telah di tentukan.            
            kalkulator.setBilangan(no1, no2);                                    //Mengambil metode setBilangan untuk mengatur nilai no1 dan no2 pada objek kalkulator.

            double hasil = kalkulator.hitung();                                  //Memangil metode hitung pada objek kalkulator untuk mendapatkan hasil perhitungan.

            if (!Double.isNaN(hasil)) {                                          // Jika hasil tidak NaN, maka menampilkan hasil perhitungan
                System.out.println("Hasil: " + hasil);
            }
            System.out.print("Apakah Anda ingin melanjutkan? (Y/T): ");        // Menu untuk melanjutkan atau menghentikan program
            String pilihan = scanner.next();

            if (pilihan.equalsIgnoreCase("t")) {                    // Jika pengguna memilih 't' (tidak), maka diubah menjadi false, sehingga loop akan berhenti 
                lanjut = false;
            }
        }
        // Menu penutupan
        System.out.println(" ");
        System.out.println("------------------------------------------");
        System.out.println("Terima kasih! Program selesai.");
        System.out.println("------------------------------------------");

        // Menutup objek scanner untuk menghinfari kebocoran memori dan mendapatkan akhir dari metode main serta kelas ProgramKalkulator2
        scanner.close();
    }
}