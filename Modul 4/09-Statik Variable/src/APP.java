                                        //STATTIC VARIABLE
class Display{
    // Variable Objek / (Data meember)
    private String nama;

    // Variabl ini millik Class
    static String tipe = "Display";

    // Konstruktor
    Display(String nama){
        this.nama = nama;
    }

    // Method untuk cetak
    void cetak(){
        System.out.println("Display Nmae : "+ this.nama);
    }

    // Method Setter
    void setTipe(String tipeInput){
        // tipe = tipeInput; //cara 1
        // this.tipe = tipeInput; //cara 2
        Display.tipe = tipeInput; // cara 3 (ini yang di rkomendasikan)
    }

}

public class APP {
    public static void main(String[] args) throws Exception {

        // Instansiasi
        Display display1 = new Display("Monitor");
        Display display2 = new Display("Smarthphone");
        display1.cetak();
        display2.cetak();

        // Menampilkan isi dari Variable Static
        System.out.println("\nMenampilkan Static Variable : ");
        System.out.println("objek 1 : " + display1.tipe);
        System.out.println("objek 2 : " + display2.tipe);
        System.out.println("class   : " + Display.tipe );
        
        // Menulis Ulang isi Variable static
        // display1.tipe = "tampilan";
        // display2.tipe = "tampilan";
        Display.tipe = "Tampilan";
        
        // Menggunakan setter
        display1.setTipe("Spanduk");        
        // Memanggil isi variable static
        System.out.println("\nMenampilkan display1 : ");
        System.out.println("objek 1 : " + display1.tipe);
        System.out.println("objek 2 : " + display2.tipe);
        System.out.println("class   : " + Display.tipe );
        
        display2.setTipe("Papan tulis");
        System.out.println("\nMenampilkan display2 ");
        System.out.println("objek 1 : " + display1.tipe);
        System.out.println("objek 2 : " + display2.tipe);
        System.out.println("class   : " + Display.tipe );
        
    }
}
