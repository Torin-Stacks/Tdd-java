package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void additionTest(){
        //given
        Calculator casio = new Calculator();
        //action
        casio.add(3,2);
        //assert
        assertEquals(5,casio.add(3,2));
    }

    @Test
    public void subtractionTest(){
        //given
        Calculator casio = new Calculator();
        //action
        casio.subtract(3,2);
        //assert
        assertEquals(1,casio.subtract(3,2));
    }
    @Test
    public void absoluteSubtractionTest(){
        //given
        Calculator casio = new Calculator();
        //action
        casio.subtract(2,3);
        //assert
        assertEquals(1,casio.subtract(2,3));
    }

    @Test
    public void multiplyTest(){
        //given
        Calculator casio = new Calculator();
        //action
        casio.multiply(3,2);
        //assert
        assertEquals(6,casio.multiply(3,2));
    }

    @Test
    public void divideTest(){
        //given
        Calculator casio = new Calculator();
        //action
        casio.divide(4,2);
        //assert
        assertEquals(2,casio.divide(4,2));
    }

}