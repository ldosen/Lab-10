package hw;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzzNegativeTen() {
        assertNull(null, FizzBuzz.fizzBuzz("-10"));
    }

    @Test
    public void testFizzBuzzNegativeOne() {
        assertNull(null, FizzBuzz.fizzBuzz("-1"));
    }

    @Test
    public void testFizzBussZero(){
        final String[] zero = {};
        List zeroList = Arrays.asList(zero);
        assertEquals(zeroList, FizzBuzz.fizzBuzz("0"));
    }

    @Test
    public void testFizzBuzzOne(){
        final String[] one = {"1"};
        List oneList = Arrays.asList(one);
        assertEquals(oneList, FizzBuzz.fizzBuzz("1"));
    }

    @Test
    public void testFizzBuzzSeven(){
        final String[] seven = {"1", "2", "fizz", "4", "buzz", "fizz", "7"};
        List sevenList = Arrays.asList(seven);
        assertEquals(sevenList, FizzBuzz.fizzBuzz("7"));
    }

    @Test
    public void testFizzBuzzSeventeen(){
        final String[] seventeen = {"1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz", "11", "fizz", "13", "14", "fizz buzz", "16", "17"};
        List seventeenList = Arrays.asList(seventeen);
        assertEquals(seventeenList, FizzBuzz.fizzBuzz("17"));
    }
}