public class Client {
    private String nom;
    private String prenom;
    private String coordonnes;

    public Client(String nom , String prenom , String coordonnes)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.coordonnes = coordonnes;
    }


    public String getNom() {
        return nom;
    }

    public String getPrenom()
    {
        return prenom;
    }


    public String GetDetails()
    {
        return "Client: " +
                "Nom: " + nom +
                " Prenom: " + prenom +
                " Coordonnee: " + coordonnes;

    }

    public void DetailsDisplay()
    {
        System.out.println(GetDetails());
    }
}
