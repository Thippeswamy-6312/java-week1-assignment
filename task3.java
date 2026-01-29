class UserMainCode {
    int isPalinNum(int input1) {
        int temp = input1;
        int rev = 0;
        while (input1 > 0) {
            rev = rev * 10 + input1 % 10;
            input1 /= 10;
        }
        if (rev == temp) return 1;
        return 2;
    }
}

public class task3 {
    public static void main(String[] args) {
        UserMainCode obj = new UserMainCode();
        System.out.println("Is 121 palindrome? " + obj.isPalinNum(121));
        System.out.println("Is 123 palindrome? " + obj.isPalinNum(123));
        System.out.println("Is 1221 palindrome? " + obj.isPalinNum(1221));
    }
}

