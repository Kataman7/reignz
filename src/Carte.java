public class Carte {
    private int poid;
    private String descritpion;
    private Choix choixGauche;
    private Choix choixDroite;
    private String image;

    public Carte(int poid, String descritpion, String image, Choix choixGauche, Choix choixDroite) {
        this.poid = poid;
        this.descritpion = descritpion;
        this.choixGauche = choixGauche;
        this.choixDroite = choixDroite;
        this.image = image;
    }

    public Choix getChoixDroite() {
        return choixDroite;
    }

    public Choix getChoixGauche() {
        return choixGauche;
    }

    public String getDescritpion() {
        return descritpion;
    }

    public String getImage() {
        return image;
    }

    public int getPoid() {
        return poid;
    }
}
