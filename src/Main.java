//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Hotel Hilton = new Hotel();
        ChambreDeLuxeLitDouble room = new ChambreDeLuxeLitDouble(4,404,8,true);
        room.DetailsDisplay();
        Hilton.addChambres(room);


    }
}
