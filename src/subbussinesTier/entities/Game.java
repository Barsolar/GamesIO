/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subbussinesTier.entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Game {

	private int number;
	private GameTitle gameTitle;
	private ArrayList<Reservation> reservations;

	public Game() {
	}
        
        public Game(GameTitle gameTitle){
            this.gameTitle=gameTitle;
        }

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public GameTitle getGameTitle() {
		return gameTitle;
	}

	public void setGameTitle(GameTitle gameTitle) {
		this.gameTitle = gameTitle;
	}

	public ArrayList<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(ArrayList<Reservation> reservations) {
		this.reservations = reservations;
	}
        
        public void addReservation(Reservation reservation){
            this.reservations.add(reservation);
        }
        
        @Override
        public boolean equals(Object o){
            if(o instanceof Game){
                if(((Game) o).getNumber()==this.number){
                    if(this.gameTitle.equals(((Game) o).getGameTitle())){
                        //if(this.reservations.equals(((Game) o).getReservations()))
                            return true;
                    }
                }
            }        
            return false;
        }
        
        public boolean isFree(LocalDate date){
            for (Reservation r : reservations){
                if(!(date.plusDays(7).isBefore(r.getDate())|date.isAfter(r.getDate().plusDays(7)))){
                    return false;
                }
            }
            return true;
        }
        
        public String[] toStringMap(){
            String [] map = new String[2];
            map[0] = Integer.toString(number);
            map[1] = gameTitle.toString();
            return map;
        }

}
