import java.util.ArrayList;

public class Consequence {
    private String description;
    private int economie;
    private int religion;
    private int militaire;
    private int population;
    private int poid;
    private ArrayList<Carte> cartes;

    public void appliquer(Jeu jeu) {
        jeu.setEconomie(jeu.getEconomie() + this.economie);
        jeu.setReligion(jeu.getReligion() + this.religion);
        jeu.set
    }
}
