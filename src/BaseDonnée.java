import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BaseDonnée {

    private String nom;
    private String url;
    private Utilisateur utilisateur;
    private Connection connection = null;

    BaseDonnée(String nom, String url, Utilisateur utilisateur) {
        this.nom = nom;
        this.url = url;
        this.utilisateur = utilisateur;
    }

    void connection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url+nom, utilisateur.getNom(), utilisateur.getMdp());
            System.out.println("Connection à la base de donnée " + nom + "réussi");
        } catch (Exception e){
            System.err.println("Impossible de se connecter à la base de donnée " + nom);
            System.err.println(e.getMessage());
            System.exit(0);
        }
    }

    void requête(String contenue) {
        try {
            Statement stmt = this.connection.createStatement();
            ResultSet rs;

            rs = stmt.executeQuery("SELECT id FROM carte");
            while ( rs.next() ) {
                String lastName = rs.getString("id");
                System.out.println(lastName);
            }
        } catch (Exception e) {
            System.err.println("Impossible d'effectuer cette requête.");
            System.err.println(e.getMessage());
        }
    }

}
