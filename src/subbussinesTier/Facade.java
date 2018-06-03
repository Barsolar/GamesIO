package subbussinesTier;

import java.time.LocalDate;
import java.util.ArrayList;
import subbussinesTier.entities.Client;
import subbussinesTier.entities.GameTitle;
import subbussinesTier.entities.Reservation;

public class Facade {

    private ArrayList<Client> clients;
    private ArrayList<GameTitle> gameTitles;
    private ArrayList<Reservation> reservations;
    
    private static Facade instance;

    public Facade() {
        clients = new ArrayList<Client>();
        gameTitles = new ArrayList<GameTitle>();
        reservations = new ArrayList<Reservation>();
    }
    
    public static Facade getInstance(){
        if(instance==null){
            instance=new Facade();
        }
        return instance;
    }

//Client
    public String[] addClient(String[] data) {
        Client client = null;
        Factory factory = Factory.getInstance();
        client = factory.createClient(data);     
        if (this.findClient(client)==null) {
            clients.add(client);
        }
        return client.toStringMap();
    }

    public Client findClient(Client client) {
        int index = gameTitles.indexOf(client);
        if (index != -1)
            return this.clients.get(index);
        return null;
    }

// Game Title
    private GameTitle searchGameTitle(GameTitle gameTitle) {
        int idx;
        if((idx = gameTitles.indexOf(gameTitle))!=-1){
            return gameTitles.get(idx);
        }
        return null;
    }

    public String[] addGameTitle(String[] data) {
        GameTitle gameTitle = null;
        Factory factory = Factory.getInstance();
        gameTitle = factory.createGameTitle(data);
        GameTitle fGameTitle = searchGameTitle(gameTitle);
        if (fGameTitle == null) {
            gameTitles.add(gameTitle);
            return gameTitle.toStringMap();
        }
        return null;
    }
    
//Game
    
     public String[] addGame(String data1[], String data2[]) {
        GameTitle temp, gameTitleExist;
        Factory factory = Factory.getInstance();
        temp = factory.createGameTitle(data1);
        if ((gameTitleExist = searchGameTitle(temp)) != null) {
            return gameTitleExist.addGame(data2);
        }
        return null;
    }   
    
    
//Reservation
    public String[] addReservation(String[] dataGameTitle, String[] dataClient, LocalDate date) {
        Reservation reservation = null;
        Factory factory = Factory.getInstance();
        GameTitle gameTitle = factory.createGameTitle(dataGameTitle),gameTitleExist;
        gameTitleExist=this.searchGameTitle(gameTitle);
        if (gameTitleExist != null) {
            if(gameTitleExist.getFreeGame(date))
            {
                Client client = findClient(factory.createClient(dataClient));
                if (client != null) {
                    client.addReservation(date,gameTitleExist.getGame());
                }
            }
        }
        return reservation.toStringMap();
    }

    public static void main(String[] args) {
        Facade facade = new Facade();
        Factory factory = Factory.getInstance();
        String[] data1 = new String[2];
        data1[0] = "Adam Mickiewicz";
        data1[1] = "7";
        Client client = factory.createClient(data1);
        String[] data2 = new String[6];
        data2[0] = "0";
        data2[1] = "12345678";
        GameTitle gameTitle = factory.createGameTitle(data2);
     //   Game game = factory.createGame(gameTitle);
        LocalDate date = LocalDate.now();
        //Reservation R = facade.addReservation(data2,data1,date);
    }
}
