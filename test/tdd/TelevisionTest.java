package tdd;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class TelevisionTest {

    Television tv = new Television();
    @Test

    public void televisionIsOnTest(){
        tv.toggleOn();
        assertTrue(tv.isItOn());
    }

    @Test

    public void televisionIsOffTest(){
        tv.toggleOn();
        tv.toggleOn();
        assertFalse(tv.isItOn());
    }

   @Test

    public void channelChangeTest(){
        tv.setChannelNumber(20);
        assertEquals(20, tv.getChannelNumber());
    }


    @Test

    public void pastChannelTest(){
        tv.setChannelNumber(20);
        tv.previousChannel();
        assertEquals(19, tv.getChannelNumber());
    }

    @Test
    public void nextChannelTest(){
        tv.setChannelNumber(20);
        tv.nextChannel();
        assertEquals(21, tv.getChannelNumber());
    }


    @Test
    public void increaseVolumeTest(){
        tv.getVolume();
        tv. increaseVolume();
        assertEquals(1, tv.getVolume());
    }


    @Test
    public void decreaseVolumeTest(){

        tv.getVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.decreaseVolume();
        assertEquals(1, tv.getVolume());
    }

    @Test
    public void volumeNotIncreasedAbove100(){
        tv.getVolume();
        for(int count = 0; count <= 100; count++){
            tv.increaseVolume();
        }
        assertEquals(100, tv.getVolume());
    }


    @Test
    public void volumeNotDecreasedBelowZero(){
        tv.getVolume();
        tv.decreaseVolume();
        assertEquals(0, tv.getVolume());


    }










    }