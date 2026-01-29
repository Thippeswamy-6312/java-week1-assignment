import java.io.*;
import java.util.*;

class UserMainCode {
    static int mostFrequentDigit(int n) {
        int[] freq = new int[10];
        
        // Handle negative numbers
        n = Math.abs(n);

        while (n > 0) {
            freq[n % 10]++;
            n /= 10;
        }

        int max = 0, digit = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > max) {
                max = freq[i];
                digit = i;
            }
        }
        return digit;
    }

    public static void main(String[] args) {
        // Test cases
        int[] testCases = {1223, 1111, 998877, 5555555, 123456, 1001001};
        
        System.out.println("Most Frequent Digit Test:");
        for (int num : testCases) {
            int result = mostFrequentDigit(num);
            System.out.println("Number: " + num + " -> Most frequent digit: " + result);
        }
    }
}
