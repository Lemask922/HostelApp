import java.util.Date;

public class Reservation {
    private Client Client;
    private Chambre Chambre ;
    private Date DateDebut;
    private Date DateFin;

    public  Reservation(Client Client, Chambre Chambre, Date DateDebut, Date DateFin)
    {
        this.Client = Client;
        this.Chambre = Chambre;
        this.DateDebut = DateDebut;
        this.DateFin = DateFin;

    }
    public String GetDetails()
    {
        return "Reservation Details: \n"+
                "Client : \n"+Client.getNom()+" "+Client.getPrenom()+
                "Chambre Numero : \n"+Chambre.getNumber()+
                "Chambre Type : \n"+Chambre.getType()+
                "Date Debut : \n"+DateDebut+
                "Date Fin : \n"+DateFin;
    }

    public void DetailsDisplay()
    {
        System.out.println(GetDetails());
    }


}
