public class Balance {

    private int economie;
    private int religion;
    private int militaire;
    private int population;
    private int science;

    // 11 est le max, 6 est le centre.
    public Balance() {
        this.economie = 6;
        this.religion = 6;
        this.militaire = 6;
        this.population = 6;
        this.science = 6;
    }

    public Balance(int economie, int religion, int militaire, int population, int science) {
        this.economie = economie;
        this.religion = religion;
        this.militaire = militaire;
        this.population = population;
        this.science = science;
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
        int max = 20;
        if (this.economie > max || this.economie < 0) return false;
        if (this.militaire > max || this.militaire < 0) return false;
        if (this.religion > max || this.religion < 0) return false;
        if (this.population > max || this.population < 0) return false;
        if (this.science > max || this.science < 0) return false;
        return true;
    }

    @Override
    public String toString() {
        return "["+this.economie+","+this.militaire+","+this.religion+","+this.population+","+this.science+"]";
    }
}
