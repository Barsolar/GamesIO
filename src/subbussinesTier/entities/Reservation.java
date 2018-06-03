/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subbussinesTier.entities;


import java.time.LocalDate;

public class Reservation {

	private Game game;
	private Client client;
	private int number;
	private LocalDate date;

	public Reservation() {

	}
        public Reservation(Client client, LocalDate date,Game game){
            this.client=client;
            this.date=date;
            this.game=game;
        }

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
        
        public boolean interferes(LocalDate dateS){
            if (date.isAfter(dateS.plusDays(14))) {
                return false;
            }else if(date.plusDays(14).isBefore(dateS)){
                return false;
            }else{
            return true;
            }
        }
        
        @Override
        public boolean equals(Object o){
            if(o instanceof Reservation){
                if(this.getGame().equals(((Reservation) o).getGame())){
                    if(this.getClient().equals(((Reservation) o).getClient())){
                        if(this.date.equals(((Reservation) o).getDate()))
                            return true;
                    }
                }
            }        
            return false;
        }
        
        public String[] toStringMap(){
            String[] map = new String[2];
            // in progress
            return map;
        }

}
