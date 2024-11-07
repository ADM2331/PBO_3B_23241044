
class Mahasiswa{

//Data member atau ciri.
String nama;
String NIM;
    
//Constructor
Mahasiswa(String nama, String NIM){
    this.nama = nama;
    this.NIM = NIM;
}
    //Membuat method tanpa retun dan tanpa parameter.
    void cetak(){

        System.out.println("Nama : "  + this.nama);
        System.out.println("NIM : " + this.NIM);
}

    //Mmbuat method dengan parameter dan tanpa parameter dan tanpa return.

    void setNama (String nama){
    this.nama = nama;
    }

    //Membuat method dengan return dan tanpa parameter.
    String getNama(){
        return this.nama;
    }

    String getNIM(){
        return this.NIM;
    }

    //Membuat methoddengan parameter dan return.

    String SayHi(String pesan){
        return "Ho..." + this.nama + pesan;

    }

}

public class APP {
    public static void main(String[] args) throws Exception {
    
        //Membuat objek
        Mahasiswa mhs_1 = new Mahasiswa ("joni", "232222");
        mhs_1.cetak ();

        // memanggil method dengan parameter dan tanpa parameter tanpa return.
        mhs_1.setNama("UDIN");
        mhs_1.cetak();

        // memanggil method dengan return tanpa parameter.
        System.out.println(mhs_1.getNama());
        System.out.println(mhs_1.getNIM());

        //memanggil method dengan parameter dan retur.
        String pesan = mhs_1.SayHi(" sukses belajar oop");
        System.out.println(pesan);






// KESIMPULAN
//  dalam Objek kita tidak akan pisah dari Method dan data.





    }
}