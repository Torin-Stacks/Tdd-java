package tdd;

import java.util.Scanner;

public class Television {

    Scanner input = new Scanner(System.in);
    boolean televisionIsOn;
    int channelNumber;
    int volume = 0;



    public void toggleOn() {
        if(televisionIsOn) {
            televisionIsOn = false;}
            else{
                televisionIsOn = true;
            }

    }

    public boolean isItOn() {
        return televisionIsOn;
    }


   public void setChannelNumber(int channelNumber) {
       this.channelNumber = channelNumber;
   }


    public int getChannelNumber() {
        return channelNumber;
    }


    public void previousChannel() {
        channelNumber = channelNumber - 1;
    }

    public void nextChannel() {
        channelNumber = channelNumber + 1;
    }


    public void increaseVolume() {
        if(volume < 100)
        volume = volume + 1;
    }

    public void decreaseVolume() {
        if(volume > 0)
            volume = volume - 1;
    }

    public int getVolume() {
        return volume;
    }
}
