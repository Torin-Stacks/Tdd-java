package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestDrillerTest {
    @Test

    public void calculateAmountToPayFor0_4Test(){
        TestDriller app = new TestDriller();
        app.amountToPay(4);
        assertEquals(8000, app.returnAmount());
    }

    @Test
    public void calculateAmountToPayFor5_9Test(){
        TestDriller app = new TestDriller();
        app.amountToPay(7);
        assertEquals((7 * 1800),app.returnAmount());
    }

    @Test
    public void calculateAmountToPayFor10_29Test(){
        TestDriller app = new TestDriller();
        app.amountToPay(25);
        assertEquals((25 * 1600),app.returnAmount());
    }

    @Test
    public void calculateAmountToPayFor30_49Test(){
        TestDriller app = new TestDriller();
        app.amountToPay(30);
        assertEquals((30 * 1500),app.returnAmount());
    }

    @Test
    public void calculateAmountToPayFor50_99Test(){
        TestDriller app = new TestDriller();
        app.amountToPay(50);
        assertEquals((50 * 1300),app.returnAmount());
    }

    @Test
    public void calculateAmountToPayFor100_199Test(){
        TestDriller app = new TestDriller();
        app.amountToPay(150);
        assertEquals((150 * 1200),app.returnAmount());
    }

    @Test
    public void calculateAmountToPayFor200_499Test(){
        TestDriller app = new TestDriller();
        app.amountToPay(499);
        assertEquals((499 * 1100),app.returnAmount());
    }

    @Test
    public void calculateAmountToPayForAbove500Test(){
        TestDriller app = new TestDriller();
        app.amountToPay(600);
        assertEquals((600 * 1000),app.returnAmount());
    }
}