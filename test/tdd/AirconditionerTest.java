package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirconditionerTest {

    @Test
    public void airConditionerIsOn() {
        //given
        Airconditioner samsung = new Airconditioner();
        //when
        samsung.isOn();
        samsung.toggleOn();
        //assert
        assertTrue(samsung.isOn());
    }

    @Test
    public void airConditionerIsOff() {
        //given
        Airconditioner samsung = new Airconditioner();
        //when
         samsung.isOn();
         samsung.toggleOn();
         samsung.toggleOn();
        //assert
        assertFalse(samsung.isOn());
    }

    @Test
    public void temperatureIncreaseByOne() {
        //given
        Airconditioner samsung = new Airconditioner();
        samsung.toggleOn();
        //action
        samsung.increaseTemperature();
        //assert
        assertEquals(17, samsung.getTemperature());
    }

    @Test
    public void temperatureDecreaseByOne() {
        //given
        Airconditioner samsung = new Airconditioner();
        samsung.toggleOn();
        //action
        samsung.decreaseTemperature() ;
        //assert
        assertEquals(16, samsung.getTemperature());
    }

    @Test
    public void noTemperatureChangeAboveThirtyDegrees() {
        Airconditioner samsung = new Airconditioner();
        samsung.toggleOn();
        //action
        samsung.increaseTemperature();
        samsung.increaseTemperature();
        samsung.increaseTemperature();
        samsung.increaseTemperature();
        samsung.increaseTemperature();
        samsung.increaseTemperature();
        samsung.increaseTemperature();
        samsung.increaseTemperature();
        samsung.increaseTemperature();
        samsung.increaseTemperature();
        samsung.increaseTemperature();
        samsung.increaseTemperature();
        samsung.increaseTemperature();
        samsung.increaseTemperature();
        samsung.increaseTemperature();
        samsung.increaseTemperature();
        samsung.increaseTemperature();
        samsung.increaseTemperature();
        //assert
        assertEquals(30, samsung.getTemperature());

    }
    @Test
    public void noTemperatureChangeBelowSixteenDegrees() {
        //given
        Airconditioner samsung = new Airconditioner();
        samsung.toggleOn();
        //action
        samsung.decreaseTemperature();
        samsung.decreaseTemperature();
        samsung.decreaseTemperature();
        samsung.decreaseTemperature();
        samsung.decreaseTemperature();
        //assert
        assertEquals(16, samsung.getTemperature());

    }
}