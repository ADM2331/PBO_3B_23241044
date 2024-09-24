import java.util.Scanner;

public class PerogramKalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih operasi: +, -, *, /");
            char operator = scanner.next().charAt(0);
        boolean lanjut = true;

        while (lanjut) {
            System.out.print("Masukkan bilangan pertama: ");
            double num1 = scanner.nextDouble();
            System.out.print("Masukkan bilangan kedua: ");
            double num2 = scanner.nextDouble();


            double hasil;
            switch (operator) {
                case '+':
                    hasil = num1 + num2;
                    break;
                case '-':
                    hasil = num1 - num2;
                    break;
                case '*':
                    hasil = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        hasil = num1 / num2;
                    } else {
                        System.out.println("Kesalahan: Pembagi tidak boleh nol.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Operasi tidak valid.");
                    continue;
            }

            System.out.println("Hasil: " + hasil);

            // Menu untuk melanjutkan atau menghentikan
            System.out.print("Apakah Anda ingin melanjutkan? (ya/tidak): ");
            String pilihan = scanner.next();
            if (pilihan.equalsIgnoreCase("tidak")) {
                lanjut = false;
            }
        }

        System.out.println("Terima kasih! Program selesai.");
        scanner.close();
    }
}