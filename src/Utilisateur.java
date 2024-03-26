public class Utilisateur {

    private String nom;
    private String mdp;
    private Jeu jeu;

    public Utilisateur(String nom, String mdp) {
        this.nom = nom;
        this.mdp = mdp;
        this.jeu = null;
        // un utilisateur sans jeu pour se connecter à la base de donnée.
    }

    public Utilisateur(String nom, String mdp, Jeu jeu) {
        this(nom, mdp);
        this.jeu = jeu;
        // un utilisateur avec jeu pour se connecter à une partie.
    }

    public String getNom() {
        return nom;
    }

    public String getMdp() {
        return mdp;
    }
}
