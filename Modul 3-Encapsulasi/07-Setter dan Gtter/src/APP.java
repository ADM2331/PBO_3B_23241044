class Data{
// data member atau variable instan
public  int intPublic;
private int intPrivate;
private double doublePrivate;

// contructor, modifier public
public Data(){
    this.intPublic = 0;
    this.intPrivate = 100;
    }
// getter
public int getIntPrivate(){
    return this.intPrivate;
    }

// setter
public void setdoublePrivate(double value){
    this.doublePrivate = value;
}
// cetak
void Cetak(){
    System.out.println(this.intPublic);
    System.out.println(this.intPrivate);
    System.out.println(this.doublePrivate);
}

}

public class APP {
    public static void main(String[] args) throws Exception {
        System.out.println( "hi dam,02- belajar 12 november 2024");

        // instansiasi oobjek
        Data objek = new Data();

        // membaca dan menulis menggunakan public
        // tulis
        objek.intPublic = 5;
        //baca
        System.out.println("publik : " + objek.intPublic);
        
        //Mmbaca menggunakan GETTER
        int angka = objek.getIntPrivate();
        System.out.println("Getter" + angka);

        // menulis mnggunakan SETTER
        objek.setdoublePrivate(0.50);
    }
}