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
    
  

    
    public String clientData [][] = {
        {"Name1", "12"},
        {"Name2", "23"},
        {"Name3", "34"},
    };

    public Client client [] = {
        new Client("Name1","12"),
        new Client("Name2",  "23"),
        new Client("Name3",  "34")
    };
    public GameTitle gameTitle[]={
        new GameTitle(1234443,"Marvel","Avengers","Olek"),
        new GameTitle(1234,"Marvel","Avengers","Olek"),
        new GameTitle(1234,"Marvel","Avengers","Olek","shooter")    
    };
    
    public String gameTitleData [][]={
    
        {"1", "1234443","Marvel","Avengers","Olek"},
        {"1", "1234","Marvel","Avengers","Olek"},
        {"2", "1234","Marvel","Avengers","Olek","shooter"}
    
    };
    GameTitle gameTi=new GameTitle(1234443,"Marvel","Avengers","Olek");
    GameTitle gameTit=new GameTitle(1234,"Marvel","Avengers","Olek");
    GameTitle gameTit2=new GameTitle(1234,"Marvel","Avengers","Olek","shooter");
    
    
    public Game game[]={
        new Game(gameTi),
        new Game(gameTit),
        new Game(gameTit2)
    };
    Client client1=new Client("Olek","1");
    LocalDate date1=LocalDate.of(2018, Month.MARCH, 4);
    Game game1=new Game(gameTi);
    public Reservation reservation[]={
        new Reservation(client1,date1,game1)    
    };
    
    
    public static int numer = 0;
    
    public LocalDate dates [] = {
        LocalDate.of(2018, Month.MARCH, 4),
        LocalDate.of(2018, Month.MARCH, 14),
        LocalDate.of(2018, Month.APRIL, 20),
        LocalDate.of(2018, Month.APRIL, 27),
        LocalDate.of(2018, Month.APRIL, 1),
        LocalDate.of(2018, Month.APRIL, 15),
        LocalDate.parse("2018-05-29")
    };
    
    
}
