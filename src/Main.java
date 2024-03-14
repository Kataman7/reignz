public class Main {

    public static void main(String[] args) {

        Balance balance1 = new Balance(1, 1, 1, 1, 1);
        Consequence conséquence1 = new Consequence(balance1, null);
        Choix choix1 = new Choix("Vous déclinez l'offre.", conséquence1);

        Balance balance2 = new Balance(0, 2, 3, 1, 1);
        Consequence conséquence2 = new Consequence(balance2, null);
        Choix choix2 = new Choix("Vous la mangez", conséquence2);

        Carte carte = new Carte(1, "On vous donne une pomme", "pomme.png", choix1, choix2);
        Carte carte2 = new Carte(1, "On vous donne une poire", "poire.png", choix1, choix2);

        Paquet paquet = new Paquet(new Carte[] {carte});
        Balance balanceJeu = new Balance(6, 6, 6, 6, 1);
        Jeu jeu = new Jeu(balanceJeu, paquet);

        System.out.println(jeu.getBalance());
        //conséquence1.appliquer(jeu.getBalance());
        System.out.println(jeu.getBalance());
        System.out.println(jeu.getBalance().estEquilibré());
    }

}