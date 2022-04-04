package PresentationLayer;


import DomainLayer.MonopolyGame;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] players = {"John","Joe"};
        MonopolyGame monopolyGame = new MonopolyGame(players);
        int diceValue = monopolyGame.PlayTurn();

        System.out.println(monopolyGame.getCurrentPlayerData());
        System.out.println(diceValue);

    }
}
