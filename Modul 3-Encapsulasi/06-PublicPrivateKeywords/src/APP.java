class Player{
    //Data Member atau Variable instant
    String nama; // defaul, bisa di akses dari luar class

    //
    public int exp; //public, bisa di acsess dari luar
    private int health; //private, tidak bisa di akses darii luar class

    //Construktor, tanpa Modifier acsess
    Player(String nama, int exp, int health){
        this.nama = nama;
        this.exp = exp;
        this.health = health;

    }

    // method, defauld modifier acsess
    void cetak(){

        kurangEXP();
        System.out.println("Player : " + this.nama);
        System.out.println("exp : " + this.exp);
        System.out.println("Health : " + this.health);
    }
    
    //method, public modifier acsess
    public void ubahHealth(int healthBaru){
        this.health = healthBaru;
    }
    // method, private modifier acsess
    private void kurangEXP(){
        this.exp -= 1;  // exp = exp -1
    }
}

public class APP {
    public static void main(String[] args) throws Exception {
        System.out.println("hi dam, belajar 12 november 2024");

        //instansiasi objek
        Player player1 = new Player("Naruto", 50, 100);

        //default
        //membaca
        System.out.println(player1.nama);
        player1.nama = "Boruto";
        System.out.println(player1.nama);

        //public
        //membaca data
        System.out.println(player1.exp);

        //menulis data
        player1.exp = 75;
        System.out.println(player1.exp);


        // // untuk akses private
        // // membaca data 
        // System.out.println(player1.health);
        // // menulis data
        // player1.health = 120;
        // System.out.println(player1.health);


        // method default
        player1.cetak();
        
        // method public
        player1.ubahHealth(125); // Method health
        player1.cetak();

        // private
        //player1.kurangEXP();
        player1.cetak();
    }

}
