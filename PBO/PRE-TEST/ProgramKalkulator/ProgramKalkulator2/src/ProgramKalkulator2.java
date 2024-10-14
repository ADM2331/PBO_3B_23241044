import java.util.Scanner;

public class ProgramKalkulator2 {
    private double no1;
    private double no2;
    private char operator;

    // Konstruktor
    public ProgramKalkulator2(char operator) {
        this.operator = operator;
    }

    public void setBilangan(double no1, double no2) {
        this.no1 = no1;
        this.no2 = no2;
    }

    public double hitung() {
        double hasil = 0;
        switch (operator) {
            case '+':
                hasil = no1 + no2;
                break;
            case '-':
                hasil = no1 - no2;
                break;
            case '*':
                hasil = no1 * no2;
                break;
            case '/':
                if (no2 != 0) {
                    hasil = no1 / no2;
                } else {
                    System.out.println("Kesalahan: Pembagi tidak boleh nol.");
                    return Double.NaN; // Kembalikan NaN jika terjadi kesalahan
                }
                break;
            default:
                System.out.println("Operasi tidak valid.");
                return Double.NaN; // Kembalikan NaN jika operasi tidak valid
        }
        return hasil;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------");
        System.out.println("Pilih operasi: *, /, +, -");
        System.out.println("-----------------------------------------------");
        System.out.println(" ");
        char operator = scanner.next().charAt(0);
        boolean lanjut = true;

        while (lanjut) {
            System.out.print("Masukkan bilangan pertama: ");
            double no1 = scanner.nextDouble();
            System.out.print("Masukkan bilangan kedua: ");
            double no2 = scanner.nextDouble();

            ProgramKalkulator2 kalkulator = new ProgramKalkulator2(operator);
            kalkulator.setBilangan(no1, no2);
            double hasil = kalkulator.hitung();

            if (!Double.isNaN(hasil)) {
                System.out.println("Hasil: " + hasil);
            }

            // Menu untuk melanjutkan atau menghentikan
            System.out.print("Apakah Anda ingin melanjutkan? (Y/T): ");
            String pilihan = scanner.next();
            if (pilihan.equalsIgnoreCase("t")) {
                lanjut = false;
            }
        }

        System.out.println(" ");
        System.out.println("------------------------------------------");
        System.out.println("Terima kasih! Program selesai.");
        System.out.println("------------------------------------------");
        scanner.close();
    }
}