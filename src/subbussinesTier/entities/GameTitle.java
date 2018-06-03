/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subbussinesTier.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import subbussinesTier.Factory;

public class GameTitle {

	private String studio, title, publisher;
	private LocalDate releaseDate;
	private int barCode;
	private Genre genre;
	private ArrayList<Game> games;
	private Game game;

	public GameTitle() {
	}
        
        public GameTitle(int barCode){
            this.barCode=barCode;
        }
        public GameTitle(int barCode, String studio,String title, String publisher){
            this.barCode=barCode;
            this.studio=studio;
            this.title=title;
            this.publisher=publisher;
        }
        public GameTitle(int barCode, String studio,String title, String publisher,String genre){
            this.barCode=barCode;
            this.studio=studio;
            this.title=title;
            this.publisher=publisher;
            Genre genre1 = null;
            switch (genre) {
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
            this.genre=genre1;
        }

	public String getStudio() {
		return studio;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getBarCode() {
		return barCode;
	}

	public void setBarCode(int barCode) {
		this.barCode = barCode;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public ArrayList<Game> getGames() {
		return games;
	}

	public void setGames(ArrayList<Game> games) {
		this.games = games;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}
        
        public String[] addGame(String[] data){
        Factory factory = Factory.getInstance();
        Game newGame;
        newGame = factory.createGame(data);
        if (search_book(newGame) == null) {
            games.add(newGame);
            newGame.setGameTitle(this);
            return newGame.toStringMap();
        }
        return null;
        }
        
    public Game search_book(Game book) {
        int idx;
        if ((idx = games.indexOf(book)) != -1) {
            game = (Game) games.get(idx);
            return game;
        }
        return null;
    }        
        
        @Override
        public boolean equals(Object o){
            if(o instanceof GameTitle){
                if(this.studio.equals(((GameTitle) o).getStudio())){
                    if(this.title.equals(((GameTitle) o).getTitle())){
                        if(this.publisher.equals(((GameTitle) o).getPublisher()))
                            if(this.barCode==((GameTitle) o).getBarCode())
                            return true;
                    }
                }
            }        
            return false;
        }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.studio);
        hash = 67 * hash + Objects.hashCode(this.title);
        hash = 67 * hash + Objects.hashCode(this.publisher);
        hash = 67 * hash + this.barCode;
        hash = 67 * hash + Objects.hashCode(this.genre);
        return hash;
    }
        
        public boolean getFreeGame(LocalDate date){
           for(Game g : games){
               if(g.isFree(date))
               {
                   game=g;
                   return true;
               }
           } 
           return false;
        }
        
        public String[] toStringMap(){
            String[] map = new String[6];
            if(genre!=null){
                map[0]="0";
                map[5]=genre.toString();
                map[4]=publisher;
                map[3]=title;
                map[2]=studio;
                map[1]=Integer.toString(barCode);
            }else if(publisher!=null&&studio!=null&&title!=null){
                map[0]="1";
                map[4]=publisher;
                map[3]=title;
                map[2]=studio;
                map[1]=Integer.toString(barCode);
            }else{
                map[0]="0";
                map[1]=Integer.toString(barCode);
            }
            return map;
        }
        
      

}

