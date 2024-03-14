import java.util.ArrayList;

public class Consequence {
    private Balance balance;
    private int poid;
    private Paquet cartes;

    public Consequence (Balance balance, int poid, Paquet cartes) {
        this.balance = balance;
        this.poid = poid;
        this.cartes = cartes;
    }

    public void appliquer(Balance balance, Paquet paquet) {
        balance.additionner(this.balance);
        paquet.ajouterCartes(this.cartes);
    }

}
