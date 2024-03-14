public class Choix {
    private String description;
    private Consequence consequence;

    public Choix(String description, Consequence consequence) {
        this.description = description;
        this.consequence = consequence;
    }

    public Consequence getConsequence() {
        return consequence;
    }
}
