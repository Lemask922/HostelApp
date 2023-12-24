
public class Chambre {
    private String type;
    private int numero;
    private int prix;
    private int Nombre;
    private boolean disponibilite;

    public Chambre(String type , int numero , int prix,int Nombre,boolean disponibilite)
    {
        this.type = type ;
        this.numero = numero ;
        this.prix = prix ;
        this.Nombre = Nombre;
        this.disponibilite = disponibilite;
    }
    public String getDetails()
    {
        return "Chambre: " + type + ", Numéro: " + numero + ", Prix: " + prix + " EUR, Disponible: " + disponibilite;

    }

    public void DetailsDisplay()
    {
        System.out.println(getDetails());
    }

    public String getType()
    {
        return type;
    }

    public int getNumber()
    {
        return numero;
    }

    public boolean estDisponible()
    {
        return disponibilite;
    }

    public void reserverchambre()
    {
        if(disponibilite)
        {
            disponibilite = false ;
            System.out.println("Chambre est reservée avec succée");
        }
        else
        {
            System.out.println("La chambre est deja reservé  ");
        }
    }

    public void annulerReservation()
    {
      disponibilite = false ;
      System.out.println("reservation est annulé");
    }

    public void FreeRoom()
    {
        this.Nombre=this.Nombre - 1;
    }
}
