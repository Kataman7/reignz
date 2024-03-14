import java.util.Scanner;
public class Jeu {

    private Balance balance;
    private Paquet pioche;
    private Paquet cartesSuivante = new Paquet();

    public Jeu(Balance balance, Paquet paquet) {
        this.pioche = paquet;
        this.balance = balance;
    }

    public Balance getBalance() {
        return balance;
    }

    public void jouerTour() {
        Carte carte;
        if (this.cartesSuivante.getPoid() > 0) {
            carte = this.cartesSuivante.piocher();
            System.out.println(carte);
        }
        else {
            carte = this.pioche.piocher();
            System.out.println(carte);
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Choisissez un nombre entre 1 et 2: ");
        int réponse = scan.nextInt();
        scan.close();

        Carte

        if (réponse == 1) {
            carte.getChoixDroite().getConsequence().appliquer(this.balance, this.cartesSuivante);
        }
        else {
            carte.getChoixGauche().getConsequence().appliquer(this.balance);
        }


    }
}