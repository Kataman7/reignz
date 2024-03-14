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

    public void appliquer(Balance balance) {

        balance.additionner(this.balance);

        if (this.cartes != null && this.cartes.getPoid() > 0) {
            for(Carte carte : this.cartes.getCartes()) {
                carte.setPoid(carte.getPoid() + this.poid);
            }
        }

    }

}
