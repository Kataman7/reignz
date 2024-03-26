import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDonnée {

    private String nom;
    private String url;
    private Utilisateur utilisateur;

    BaseDonnée(String nom, String url, Utilisateur utilisateur) {
        this.nom = nom;
        this.url = url;
        this.utilisateur = utilisateur;
    }

    void connection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url+nom, utilisateur.getNom(), utilisateur.getMdp());
            System.out.println("Connection à la base de donnée " + nom + "réussi");
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Impossible de se connecter à la base de donnée " + nom);
            System.exit(0);
        }

    }

    String requête(String contenue) {
        return null;
    }

}
