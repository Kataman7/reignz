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

    public void jouer() {
        //Paquet cartes = new Paquet();
        //Paquet carteSuivantes = new Paquet();
    }
}