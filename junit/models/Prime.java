package models;

/**
 * Represents information about a passenger's baggage, including its weight and dimensions.
 * Provides functionality to calculate and retrieve baggage volume and weight, and to calculate any excess fee based on weight and volume limits.
 */
public class Prime {
    // Prime.java

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        int i = 5;
        while (i * i <= n) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }

}
