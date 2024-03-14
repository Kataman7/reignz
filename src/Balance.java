public class Balance {

    private int economie;
    private int religion;
    private int militaire;
    private int population;

    // 11 est le max, 6 est le centre.
    public Balance() {
        this.economie = 6;
        this.religion = 6;
        this.militaire = 6;
        this.population = 6;
    }

    public Balance(int economie, int religion, int militaire, int population) {
        this.economie = economie;
        this.religion = religion;
        this.militaire = militaire;
        this.population = population;
    }

    public int getEconomie() {
        return economie;
    }

    public int getReligion() {
        return religion;
    }

    public int getMilitaire() {
        return militaire;
    }

    public int getPopulation() {
        return population;
    }

    public void additionner(Balance balance) {
        this.economie += balance.getEconomie();
        this.militaire += balance.getMilitaire();
        this.religion += balance.getReligion();
        this.population += balance.getPopulation();
    }

    public boolean estEquilibré() {
        if (this.economie > 11 || this.economie < 0) return false;
        if (this.militaire > 11 || this.militaire < 0) return false;
        if (this.religion > 11 || this.religion < 0) return false;
        if (this.population > 11 || this.population < 0) return false;
        return true;
    }

    @Override
    public String toString() {
        return "["+this.economie+","+this.militaire+","+this.religion+","+this.population+"]";
    }
}
