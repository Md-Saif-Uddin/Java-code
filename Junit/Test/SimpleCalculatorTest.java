package Junit.Test;

import Junit.SimpleCalculator;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {

    @Test
    public void twoPlusTwoEqualFour(){
        var calculator = new SimpleCalculator();
        assertEquals(4,calculator.add(2,2));
    }

    @Test
    public void threePlusSevenEqualTen(){
        var calculator = new SimpleCalculator();
        assertEquals(10,calculator.add(3,7));
    }
}