package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartRatesTest {

    private HeartRates heartRates = new HeartRates("Torin", "Ajanaku", "01-01-1990");

    @Test
    public void objectHasBeenConstructedTest(){
        heartRates.getFirstName();
        assertEquals("Torin", heartRates.getFirstName());
    }

}
