package JUnitTests;

import org.junit.Test;

import models.Prime;

import static org.junit.Assert.*;

public class PrimeTest {
    
    @Test
    public void testIsPrime() {
        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(3));
        assertTrue(Prime.isPrime(5));
        assertTrue(Prime.isPrime(7));
        assertTrue(Prime.isPrime(11));
        assertTrue(Prime.isPrime(13));
        assertTrue(Prime.isPrime(17));
        assertTrue(Prime.isPrime(19));
        assertTrue(Prime.isPrime(23));
        assertTrue(Prime.isPrime(29));
        assertTrue(Prime.isPrime(31));
        assertTrue(Prime.isPrime(37));
        
        assertFalse(Prime.isPrime(1));
        assertFalse(Prime.isPrime(4));
        assertFalse(Prime.isPrime(6));
        assertFalse(Prime.isPrime(8));
        assertFalse(Prime.isPrime(9));
        assertFalse(Prime.isPrime(10));
        assertFalse(Prime.isPrime(12));
        assertFalse(Prime.isPrime(15));
        assertFalse(Prime.isPrime(21));
        assertFalse(Prime.isPrime(25));
        assertFalse(Prime.isPrime(30));
        assertFalse(Prime.isPrime(35));
    }
}
