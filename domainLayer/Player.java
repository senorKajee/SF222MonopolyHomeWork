package DomainLayer;

public class Player {
    private String name;
    private int location;
    private int round;
    private int money;

    public Player(String name){
        this.name = name;
        this.location = 0;
        this.round = 0;
        this.money = 1000;
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
    public int getLocationValue(board b1){
      b1.getLocationValue();
      return location;
    }
    public int checkRound(){
      return round;
    }
    publice int buyEstate(board b1){
      int estatePrice = b1.getLocationPrice
      if (this.money >estatePrice){
        this.money = this.money - estatePrice
        System.out.println("Purchase successfully")
      }else{
        System.out.println("Can not Purchase")
      }
    }

}
