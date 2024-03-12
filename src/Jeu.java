public class Jeu {

    private int economie;
    private int religion;
    private int militaire;
    private int population;
    private Paquet paquet;

    public Jeu() {
        this.economie = 0;
        this.religion = 0;
        this.militaire = 0;
        this.population = 0;
    }

    public Jeu(int economie, int religion, int militaire, int population) {
        this.economie = economie;
        this.religion = religion;
        this.militaire = militaire;
        this.population = population;
    }

    public int getEconomie() {
        return economie;
    }

    public int getMilitaire() {
        return militaire;
    }

    public int getPopulation() {
        return population;
    }

    public int getReligion() {
        return religion;
    }

    public Paquet getPaquet() {
        return paquet;
    }

    public void setEconomie(int economie) {
        this.economie = economie;
    }

    public void setMilitaire(int militaire) {
        this.militaire = militaire;
    }

    public void setPaquet(Paquet paquet) {
        this.paquet = paquet;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setReligion(int religion) {
        this.religion = religion;
    }
}