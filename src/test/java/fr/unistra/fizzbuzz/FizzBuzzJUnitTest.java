package fr.unistra.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzJUnitTest {

    private FizzBuzz fizzbuzz = new FizzBuzz();

    @Test
    public void returnsNumberForInputNotDivisibleByThreeAndFive() {
        assertEquals("1", fizzbuzz.convert(1));
        assertEquals("2", fizzbuzz.convert(2));
        assertEquals("4", fizzbuzz.convert(4));
        assertEquals("7", fizzbuzz.convert(7));
        assertEquals("11",fizzbuzz.convert(11));
        assertEquals("13",fizzbuzz.convert(13));
        assertEquals("14",fizzbuzz.convert(14));
    }

    @Test
    public void returnsFizzForNummbersDivisibleByThree(){
        assertEquals("FIZZ", fizzbuzz.convert(9));
        assertEquals("FIZZ", fizzbuzz.convert(3));
    }

    @Test
    public void returnsBUZZForNumbersDivisibleByFive(){
        assertEquals("BUZZ", fizzbuzz.convert(5));
        assertEquals("BUZZ", fizzbuzz.convert(10));
        assertEquals("BUZZ", fizzbuzz.convert(20));
    }
    @Test
    public void returnsFIZZBUZZForNumbersDivisibleByThreeAndFive(){
        assertEquals("FIZZBUZZ", fizzbuzz.convert(15));
        assertEquals("FIZZBUZZ", fizzbuzz.convert(30));
    }
}