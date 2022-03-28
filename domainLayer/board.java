package DomainLayer;

public class Board{
  private int locationValue;

  public int getLocation(){
    return this.locationValue;
  }
  public int moveToLocation(diceValue){
    this.locationValue = locationValue + diceValue;
    return this.locationValue;
  }

}
