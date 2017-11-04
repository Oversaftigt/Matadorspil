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
public class monopoly {

    private Dice dice;

    Scanner input = new Scanner(System.in);
    private List<Player> players = new ArrayList<Player>();

    private boolean gameEnd = false;

    public monopoly() {
        //players = new Player();
        dice = new Dice();

    }

    public void play() {
        System.out.println("Welcome to monopoly.");

        //Create players
        createPlayers();
        while (!gameEnd) {
            for (int i = 0; i < players.size(); i++) {
                players.get(i).movePlayer();
                System.out.println(players.get(i).getName() + " has moved to position" + players.get(i).getcurrentPosition());
                checkForWinner(players.get(i));
                if (gameEnd) {
                    break;
                }
            }

        }

    }

    public void createPlayers() {
        System.out.println("\nThere can be up to 5 players in this game."
                + "\nAt least 2 players are required to play the game though"
                + "\nPlease enter the number of players wanted:");

        int numberOfPlayers = 0;
        //This first input determines the number of players, and the input has to be an integer from 2 to 5
        while (numberOfPlayers <= 1 || numberOfPlayers > 5) {
            if (input.hasNextInt() == true) {
                numberOfPlayers = input.nextInt();
            }
            if (numberOfPlayers == 2 || numberOfPlayers == 3 || numberOfPlayers == 4 || numberOfPlayers == 5) {
                break;
            }
            System.out.println("Please enter an integer between 2 and 5");
            input.nextLine();
        }
        System.out.println("This game will have " + numberOfPlayers + " players.");

        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Enter the game of player " + i + 1 + ".");

            players.add(new Player(input.next()));
        }

    }

    public void checkForWinner(Player player) {
        if (player.getcurrentPosition() > 40) {
            gameEnd = true;
            System.out.println("The winner of this game is " + player.getName());
        }
    }

}
