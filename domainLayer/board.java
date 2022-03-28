package DomainLayer;

public class Board{
  private int boardValue;
  private int locationValue;

  public Board(){

  }
  
  public int moveToLocation(diceValue){
    this.locationValue = locationValue + diceValue;
    return this.locationValue;
  }

}
