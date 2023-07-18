package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {

    @Test

    public void testThatBikeIsOn(){
        Bike honda = new Bike();
        honda.isOn();
        honda.ignition();
        assertTrue(honda.isOn());
    }

    @Test
    public void testThatBikeIsOff(){
        Bike honda = new Bike();
        honda.isOn();
        honda.ignition();
        honda.ignition();
        assertFalse(honda.isOn());
    }

    @Test
    public void bikeAccelerateByOneTest(){
        Bike honda = new Bike();
        honda.ignition();
        honda.accelerate(19);
        assertEquals(20, honda.getSpeed());
    }


    @Test
    public void bikeAccelerateByTwoTest(){
        Bike honda = new Bike();
        honda.ignition();
        honda.accelerate(22);
        assertEquals(24, honda.getSpeed());
    }

    @Test
    public void BikeAccelerateByThreeTest(){
        Bike honda = new Bike();
        honda.ignition();
        honda.accelerate(32);
        assertEquals(35, honda.getSpeed());
    }

    @Test
    public void BikeAccelerateByFourTest(){
        Bike honda = new Bike();
        honda.ignition();
        honda.accelerate(40);
        assertEquals(44, honda.getSpeed());
    }


    @Test
    public void BikeDeccelerateByOne(){
        Bike honda = new Bike();
        honda.ignition();
        honda.deccelerate(15);
        assertEquals(14, honda.getSpeed());
    }

    @Test
    public void bikeDeccelerateByTwo(){
        Bike honda = new Bike();
        honda.ignition();
        honda.deccelerate(25);
        assertEquals(23, honda.getSpeed());
    }

    @Test
    public void bikeDeccelerateByThree(){
        Bike honda = new Bike();
        honda.ignition();
        honda.deccelerate(35);
        assertEquals(32, honda.getSpeed());
    }

    @Test
    public void bikeDeccelerateByFour(){
        Bike honda = new Bike();
        honda.ignition();
        honda.deccelerate(40);
        assertEquals(36, honda.getSpeed());
    }
}