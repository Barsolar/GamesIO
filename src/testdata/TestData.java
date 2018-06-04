/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdata;

import java.time.LocalDate;
import java.time.Month;
import subbussinesTier.entities.Client;
import subbussinesTier.entities.Game;
import subbussinesTier.entities.GameTitle;
import subbussinesTier.entities.Reservation;

/**
 *
 * @author Bartek
 */
public class TestData {

    public String clientData[][] = {
        {"Name1", "12"},
        {"Name2", "23"},
        {"Name3", "34"},};

    public Client client[] = {
        new Client("Name1", "12"),
        new Client("Name2", "23"),
        new Client("Name3", "34")
    };
    public GameTitle gameTitle[] = {
        new GameTitle(1234443, "Marvel", "Avengers", "Olek"),
        new GameTitle(1234, "Marvel", "Avengers", "Olek"),
        new GameTitle(1234, "Marvel", "Avengers", "Olek", "shooter")
    };

    public String gameTitleData[][] = {
        {"1", "1234443", "Marvel", "Avengers", "Olek"},
        {"1", "1234", "Marvel", "Avengers", "Olek"},
        {"2", "1234", "Marvel", "Avengers", "Olek", "shooter"}

    };
    
    public Game game[] = {
        new Game(gameTitle[0]),
        new Game(gameTitle[1]),
        new Game(gameTitle[2])
    };
    
    public Game games[]={
      new Game(1,gameTitle[0])  
    };
    
    public String gameResult[][]={
        {"1", "Avengers"} 
    };
    
    public String gameData[][]={
        {"0"},
        {"1"},
        {"2"}
    };
    
    public LocalDate dates[] = {
        LocalDate.of(2018, Month.MARCH, 4),
        LocalDate.of(2018, Month.MARCH, 14),
        LocalDate.of(2018, Month.APRIL, 20)        
    };
    
    public Reservation reservation[] = {
        new Reservation(client[0], dates[0], game[0]),
        new Reservation(client[1], dates[1], game[1]),
        new Reservation(client[2], dates[2], game[2])
    };
    
    public Reservation reservations[] = {
        new Reservation(client[0], dates[0], game[0]),
        new Reservation(client[1], dates[1], game[0]),
        new Reservation(client[2], dates[2], game[0])
    };


    

}
