import java.util.ArrayList;

class Player{
    // variable objek
    private String nama;
    // variable static
    private static int numberOfPlayer;
    // Arry Variable
    private static ArrayList<String> namaList = new ArrayList<String>();

    // Konsstruktor 
    Player(String nama){
    this.nama = nama;
    Player.numberOfPlayer++;
    Player.namaList.add(this.nama);

    }

    // Method static Cetak NUmberOfPlayer
    static void showNumberOfPlayer(){
        System.out.println("Numbr OfPlayer : " + Player.numberOfPlayer);
    }

    void cetak(){
        System.out.println("player nama : ");
    }

    // Method statuc Getter
    static ArrayList<String> getName(){
        return Player.namaList;
    }
}


public class APP {
    public static void main(String[] args) throws Exception {

    Player player1 = new Player("udin");
    Player player2 = new Player("ucok");
    Player player3 = new Player("Gundala");
    Player player4 = new Player("Mesi");
    Player player5 = new Player("Mes");
    Player player6 = new Player("si");


    Player.showNumberOfPlayer();
    player1.cetak();

    // Panggil array nama obejek
    System.out.println("Nama : " + Player.getName() );




    }
}
