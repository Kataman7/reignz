import java.util.ArrayList;

public class Consequence {
    private Balance balance;
    private int poid;
    private ArrayList<Carte> cartes;

    public Consequence (Balance balance, int poid, ArrayList<Carte> cartes) {
        this.balance = balance;
        this.poid = poid;
        this.cartes = cartes;
    }

}
