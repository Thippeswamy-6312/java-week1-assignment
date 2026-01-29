import java.io.*;
import java.util.*;

class UserMainCode {
    static int sumOfPowerDigits(int n) {
        int temp = n, sum = 0;
        int digits = String.valueOf(n).length();

        while (temp > 0) {
            int d = temp % 10;
            sum += (int) Math.pow(d, digits);
            temp /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Test cases
        int[] testCases = {153, 370, 371, 407, 123, 9474};
        
        System.out.println("Sum of Power Digits Test:");
        for (int num : testCases) {
            int result = sumOfPowerDigits(num);
            System.out.println("Number: " + num + " -> Sum of digits^" + String.valueOf(num).length() + " = " + result);
        }
    }
}
