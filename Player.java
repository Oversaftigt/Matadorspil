/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import java.util.*;

/**
 *
 * @author User
 */
public class Player {
    
    private Field currentField = new Field();
    private String name;
    private Dice dice = new Dice();
    private int currentPosition=0;
    
    public Player(){
        
    }
    
    public Player(String name){
        this.name = name;
        
    }
    public void setName(String name){
        
    }
    
    public String getName(){
        return name;
    }
    
    public int getcurrentPosition(){
        return currentPosition;
    }
    
    public void movePlayer(){
        currentPosition = currentPosition + dice.throwDice();
        
    }
    

}
