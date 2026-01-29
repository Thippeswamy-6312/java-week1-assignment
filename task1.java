public class task1 {
    public static int EvenOddDigitsSum(int input1, String input2) {
        int sum = 0;
        while (input1 > 0) {
            int d = input1 % 10;
            if (input2.equals("even") && d % 2 == 0) sum += d;
            if (input2.equals("odd") && d % 2 != 0) sum += d;
            input1 /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Test cases
        int num = 12345;
        System.out.println("Number: " + num);
        System.out.println("Sum of even digits: " + EvenOddDigitsSum(num, "even"));
        System.out.println("Sum of odd digits: " + EvenOddDigitsSum(num, "odd"));
    }
}

