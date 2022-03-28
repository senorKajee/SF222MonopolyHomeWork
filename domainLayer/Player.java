package DomainLayer;

public class Player {
    private String name;
    public Player(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int rollDice(Die d1,Die d2){
        d1.RandomNumber();
        d2.RandomNumber();

        int value = d1.getFaceValue() + d2.getFaceValue();
        return value;
    }
}
