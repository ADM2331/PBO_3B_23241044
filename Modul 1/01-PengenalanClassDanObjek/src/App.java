// membuat class sebagai template

class Mahasiswa{
    
    //Membuat ciri ciri atau atribut Objek
    String nama;
    String NIM;
    String prodi;
    double IPK;
    int umur;

}
public class App {
    public static void main(String[] args) throws Exception {
        //instansisai atau membuat objek
        Mahasiswa mhs_1 = new Mahasiswa();

        // pengisian data objek Mhs_1
        mhs_1.nama = "ucup";
        mhs_1.NIM = "2324102p";
        mhs_1.prodi = "PTI";
        mhs_1.IPK = 3.0;
        mhs_1.umur = 21;

        //Mmembuat Objk baru
        Mahasiswa mhs_2 = new Mahasiswa();

        // Pengisian data Objek mhs_2
        mhs_2.nama = "suaep";
        mhs_2.NIM = "2324100";
        mhs_2.prodi = "Olahraga";
        mhs_2.IPK = 4.0;
        mhs_2.umur = 20;
        


        //cetak data mhs_1
        System.out.println(" ");
        System.out.println("*************************************");
        System.out.println("Nama Mahasiswa  : " + mhs_1.nama);
        System.out.println("NIM Mahasiswa   : " + mhs_1.NIM);
        System.out.println("Prodi Mahasiswa : " + mhs_1.prodi);
        System.out.println("IPK Mahasiswa   : " + mhs_1.IPK);
        System.out.println("Umur Mahasiswa  : " + mhs_1.umur);
        System.out.println(" ");
        System.out.println("*************************************");
        System.out.println(" ");
        
        //cetak data mhs_2
        System.out.println("Nama Mahasiswa  : " + mhs_2.nama);
        System.out.println("NIM Mahasiswa   : " + mhs_2.NIM);
        System.out.println("Prodi Mahasiswa : " + mhs_2.prodi);
        System.out.println("IPK Mahasiswa   : " + mhs_2.IPK);
        System.out.println("Umur Mahasiswa  : " + mhs_2.umur);
        System.out.println("**************************************");
        System.out.println(" ");

    }
}
