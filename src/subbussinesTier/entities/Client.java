package subbussinesTier.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import subbussinesTier.Factory;

public class Client {

	private String name;
	private int number;
	private ArrayList<Reservation> reservation;

	public Client() {
 
	}
        public Client(String name, String number){
            this.name = name;
            this.number = Integer.valueOf(number);
            reservation = new ArrayList();
        }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public ArrayList<Reservation> getReservation() {
		return reservation;
	}

	public void setReservation(ArrayList<Reservation> reservation) {
		this.reservation = reservation;
	}
        
        public String[] toStringMap(){
            String[] map = new String[2];
            map[0]=name;
            map[1]=Integer.toString(number);
            return map;
        }
        
        public void addReservation(LocalDate date, Game game){
            Factory factory = Factory.getInstance();
            Reservation r = factory.createReservation(game, date, this);
            game.addReservation(r);
            this.reservation.add(r);
            
        }
        
        @Override
        public boolean equals(Object o){
            if(o==this){
                return true;
            }else if(o instanceof Client){
                Client c = (Client) o;
                if(this.name.equals(c.getName()))
                    if(this.number==c.getNumber())
                        return true;
            }
            return false;
        }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + this.number;
        return hash;
    }

}
