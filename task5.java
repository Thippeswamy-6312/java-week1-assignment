import java.io.*;
import java.util.*;

class UserMainCode {
    public int countPrimesInRange(int input1, int input2) {
        int cou = 0;
        
        // Iterate through range
        for (int d = input1; d <= input2; d++) {
            if (isPrime(d)) {
                cou++;
                System.out.println(d);
            }
        }
        return cou;
    }
    
    // Helper method to check if a number is prime
    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        UserMainCode obj = new UserMainCode();
        int result = obj.countPrimesInRange(10, 30);
        System.out.println("Total primes found: " + result);
    }
}
