/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subbussinesTier;


import subbussinesTier.entities.Client;
import subbussinesTier.entities.Game;
import subbussinesTier.entities.GameTitle;
import subbussinesTier.entities.Genre;
import subbussinesTier.entities.Reservation;
import java.time.LocalDate;

public class Factory {
    
    private static Factory factory;
    
    public static Factory getInstance(){
        if(factory==null){
            factory=new Factory();
        }
        return factory;
    }

	public Factory() {

	}

	public GameTitle createGameTitle(String[] data) {
		GameTitle gameTitle = null;
		if (data[0].equals("0")) {
			gameTitle = new GameTitle();
			gameTitle.setBarCode(Integer.parseInt(data[1]));
		} else if (data[0].equals("1")) {
			gameTitle = new GameTitle();
			gameTitle.setBarCode(Integer.parseInt(data[1]));
			gameTitle.setStudio(data[2]);
			gameTitle.setTitle(data[3]);
			gameTitle.setPublisher(data[4]);
		} else if (data[0].equals("2")) {
			gameTitle = new GameTitle();
			gameTitle.setBarCode(Integer.parseInt(data[1]));
			gameTitle.setStudio(data[2]);
			gameTitle.setTitle(data[3]);
			gameTitle.setPublisher(data[4]);
			Genre genre1 = null;
			switch (data[5]) {
			case "shooter":
				genre1 = Genre.shooter;
				break;
			case "strategyr":
				genre1 = Genre.strategy;
				break;
			case "rolePlay":
				genre1 = Genre.rolePlay;
				break;
			case "simulation":
				genre1 = Genre.simulation;
				break;
			case "battleArena":
				genre1 = Genre.battleArena;
				break;
			case "storyBased":
				genre1 = Genre.storyBased;
				break;
			case "cardGame":
				genre1 = Genre.cardGame;
				break;
			case "indie":
				genre1 = Genre.indie;
				break;
			case "platformer":
				genre1 = Genre.platformer;
				break;
			}
			gameTitle.setGenre(genre1);
		}
		return gameTitle;
	}

	public Client createClient(String[] data) {
		Client client = new Client();
		client.setName(data[0]);
		client.setNumber(Integer.parseInt(data[1]));
		return client;
	}
        
        public Reservation createReservation(Game game, LocalDate date, Client client){
            Reservation reservation = new Reservation();
            reservation.setClient(client);
            reservation.setDate(date);
            reservation.setGame(game);
            return reservation;
        }
        
       // public Reservation createReservation(String[] data){
        //    Reservation reservation = new Reservation();
        //    //in progress
        //    return reservation;
        //}
        
        public Game createGame(GameTitle gameTitle){
            Game game = new Game();
            game.setGameTitle(gameTitle);
            return game;
        }
        
    public Game createGame(String[] data) {
        Game game = null;
                game = new Game();
                game.setNumber(Integer.parseInt(data[0]));
        return game;
    }

}

