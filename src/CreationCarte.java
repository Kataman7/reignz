public abstract class CreationCarte {
    public Carte creationCarte(String description, String image, String descgauche, int eg, int rg, int mg, int pg, int sg, String descdroite, int ed, int rd, int md, int pd, int sd){
        Paquet paquetg =new Paquet();
        Balance balanceg =new Balance(eg,rg,mg,pg,sg);
        Consequence consequenceg=new Consequence(balanceg,paquetg);
        Choix g = new Choix(descgauche,consequenceg);
        Paquet paquetd =new Paquet();
        Balance balanced =new Balance(ed,rd,md,pd,sd);
        Consequence consequenced=new Consequence(balanced,paquetd);
        Choix d = new Choix(descdroite,consequenced);
        Carte c = new Carte(1,description,image,g,d);
        return c;
    }

}
