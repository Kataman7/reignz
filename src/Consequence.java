import java.util.ArrayList;

public class Consequence {
    private Balance balance;
    private Paquet cartes;

    public Consequence (Balance balance, Paquet cartes) {
        this.balance = balance;
        this.cartes = cartes;
    }

    public void appliquer(Balance balance, Paquet paquet) {
        balance.additionner(this.balance);
        paquet.ajouterCartes(this.cartes);
    }

}
