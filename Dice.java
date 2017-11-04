/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import java.util.Random;

/**
 *
 * @author User
 */
public class Dice {

    private int diceNumber;
    private int diceNumber2;
    private int totalDice;
    private Random random = new Random();
           

    public int throwDice() {
        diceNumber = random.nextInt(6) + 1;
        diceNumber2 = random.nextInt(6) + 1;
        totalDice=diceNumber + diceNumber2;
        
        return totalDice;
    }

    public int getTotalDice() {
        throwDice();
        return totalDice;
    }
    
    
    public boolean sameNumbers(){
        if (diceNumber==diceNumber2){
            return true;
        }
        else{
            return false;
        }
    }
    
    
}
