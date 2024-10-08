//class poloss atau tanpa construktor

class Polos{

    // atribut Objek
    String dataString;
    int dataInteger;
}

//class dengan constructor
class Mahasiswa{

    //atribur atau data member

    String nama;
    String NIM;
    String prodi;
    String Tinggi;

    

    //constructor cirinya 
    //1. namanya sama dengan nama class
    //2. tidak mmiliki retrun value/ nilai bali
    //3. method yang pertama kali di panggil saat objek pertama kali di buat
    Mahasiswa(String inputNama, String inputNim, String inputProdi, String inputTinggi){
       
       // prilaku prtama adalah Mengisi Data
        nama = inputNama;
        NIM = inputNim;
        prodi = inputProdi;
        Tinggi = inputTinggi;

        // mMencetak data
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("NIM : " + NIM);
        System.out.println("Prodi :" + prodi);
        System.out.println("Tinggi badan: " + Tinggi);
        

    }
}



public class App {
    public static void main(String[] args) throws Exception {
        // Pembuatan Objek atau instansiai Objek
        Polos polos_1 = new Polos();

        //isi atribut
        polos_1.dataString = "polos";
        polos_1.dataInteger = 10;

        System.out.println(polos_1.dataString);
        System.out.println(polos_1.dataInteger);
        System.out.println(" ");
        System.out.println("**************************************************************** ");


        // pembuatan Objek Mahasiswa
        Mahasiswa mhs_1 = new Mahasiswa("otong", "12345", "PTI", "200cm");
        System.out.println("*****************************************************************");
        Mahasiswa mhs_2 = new Mahasiswa("Udin", "1345", "PTI", "300cm");
        System.out.println("*****************************************************************");
        Mahasiswa mhs_3 = new Mahasiswa("Bacod", "111", "PTI", "350cm");
        System.out.println("*****************************************************************");
        

    
    }
}
