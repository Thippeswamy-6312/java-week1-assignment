public class task9 {
    static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    static int sumNonPrimeIndex(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!isPrime(i)) sum += arr[i];
        }
        return sum;
    }
    
    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        
        System.out.println("Sum of elements at non-prime indices (arr1): " + sumNonPrimeIndex(arr1));
        System.out.println("Sum of elements at non-prime indices (arr2): " + sumNonPrimeIndex(arr2));
    }
}
