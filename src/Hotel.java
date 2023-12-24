
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Hotel {
    private List<Chambre> Chambres ;
    private List<Client>  Clients;
    private List<Reservation> Reservations;


    public Hotel()
    {
        this.Chambres = new ArrayList<>();
        this.Clients = new ArrayList<>();
        this.Reservations = new ArrayList<>();
    }

    public void CreateandaddChambre(String type , int numero ,int prix ,int Nombre, boolean disponibilite)
    {
        Chambre NewRoom = new Chambre(type,numero,prix,Nombre,disponibilite);
        addChambres(NewRoom);
    }

    public void CreateandaddClient(String Nom, String prenom, String Coordonnes)
    {
        Client NewClient = new Client(Nom,prenom,Coordonnes);
        addClients(NewClient);
    }

    public void CreateandaddReservation(Client Client,Chambre Chambre,Date DateDebut,Date DateFin)
    {
        Reservation NewBook = new Reservation(Client,Chambre,DateDebut,DateFin);
        addReservation(NewBook);
    }

    public void addReservation(Reservation reservation)
    {
        Reservations.add(reservation);
    }

    public void addClients(Client Client)
    {
        Clients.add(Client);
    }

    public void addChambres(Chambre room )
    {
        Chambres.add(room);
    }

    public void afficherDetailsChambres() {
        for (Chambre chambre : Chambres) {
            System.out.println(chambre.getDetails());
        }
    }
}
