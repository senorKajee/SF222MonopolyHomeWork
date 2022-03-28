package DomainLayer;

import java.util.Random;

public class Die {
    private int faceValue;


    public  Die(){

    }
    public void RandomNumber(){
        Random random = new Random();
        this.faceValue = random.nextInt(6)+1;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
