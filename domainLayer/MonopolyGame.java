package DomainLayer;

public class MonopolyGame {

    private Die[] dice;
    private Player[] players;
    private int turnNumber;
    private int locate;
    private int board;




    public MonopolyGame(String[] playerNames){
        this.players = new Player[playerNames.length];

        for (int i= 0 ;i < playerNames.length;i++){
            this.players[i] = new Player(playerNames[i]);
        }

        this.dice = new Die[2];
        this.dice[0] = new Die();
        this.dice[1] = new Die();

        this.board = new board();

        this.turnNumber = 0;
    }
    public int PlayTurn(){
        Player currentPlayer = this.players[turnNumber];
        int diceValue = currentPlayer.rollDice(this.dice[0],this.dice[1]);
        int newLocation = currentPlayer.upDateLocation(diceValue);
        return diceValue;
    }
    public String getCurrentPlayerData(){
        Player currentPlayer = this.players[turnNumber];
        return currentPlayer.getName();
    }



}
