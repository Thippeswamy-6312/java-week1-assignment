import java.io.*;
import java.util.*;

class UserMainCode {
    static int uniqueDigitCount(int n) {
        boolean[] seen = new boolean[10];
        int count = 0;
        
        // Handle negative numbers
        n = Math.abs(n);

        while (n > 0) {
            int d = n % 10;
            if (!seen[d]) {
                seen[d] = true;
                count++;
            }
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        // Test cases
        int[] testCases = {1234, 1111, 123123, 999, 102030, 987654};
        
        System.out.println("Unique Digit Count Test:");
        for (int num : testCases) {
            int result = uniqueDigitCount(num);
            System.out.println("Number: " + num + " -> Unique digits: " + result);
        }
    }
}