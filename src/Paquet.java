import java.util.ArrayList;
import java.util.Arrays;

public class Paquet {

    private ArrayList<Carte> cartes = new ArrayList<>();
    private int poid;

    public Paquet(ArrayList<Carte> cartes) {
        this.cartes.addAll(cartes);
    }
    public Paquet(Carte[] cartes) {
        this.cartes.addAll(Arrays.asList(cartes));
    }

    public ArrayList<Carte> getCartes() {
        return cartes;
    }

    public int poidMax() {

        if (this.cartes.isEmpty()) return 0;

        int poid = this.cartes.getFirst().getPoid();
        for (Carte carte : this.cartes) {
            if (carte.getPoid() > poid) poid = carte.getPoid();
        }
        return poid;
    }

    public Carte piocher() {
        int random = (int) (Math.random() * this.poid);
        int i = 0;
        while (random > 0) {
            random -= this.cartes.get(i).getPoid();
            i++;
        }
        return this.cartes.get(i);
    }

    public int getPoid() {
        return poid;
    }
}
