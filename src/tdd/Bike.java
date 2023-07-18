package tdd;

public class Bike {

    private boolean isOn;
    private int speed;


    public void ignition() {
        if (isOn == false) isOn = true;
        else isOn = false;

    }

    public boolean isOn() {
        return isOn;
    }

    public void accelerate(int acceleration){
         if (acceleration <= 20) speed =  acceleration+ 1; //gear one
         if (acceleration >= 21 && acceleration <= 30) speed = acceleration + 2; // gear two
        if (acceleration>= 31 && acceleration <= 40) speed = acceleration + 3; //gear three
        if(acceleration >= 40) speed = acceleration + 4; //gear four

    }

    public void deccelerate(int decceleration) {
        if (decceleration <= 20) speed = decceleration - 1; //gear one
        if (decceleration >= 21 && decceleration <= 30) speed = decceleration- 2; // gear two
        if (decceleration >= 31 && decceleration <= 40) speed = decceleration - 3; //gear three
        if (decceleration>= 40) speed = decceleration - 4; //gear four
    }

    public int getSpeed(){
        return speed;
    }

}