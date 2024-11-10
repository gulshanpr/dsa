package easy;

public class Palindrome {
    static int rev(int n){
        int digit = (int)(Math.log10(n)) + 1;

        return helper(n, digit);
    }

    private static int helper(int n, int digit) {
        if (n == 0){
            return 0;
        }

        int rem = n % 10;

        return rem * (int)Math.pow(10, digit - 1) + helper(n / 10, digit - 1);
    }

    static boolean isPalindrome(int n){
        return (n == rev(n));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }


}
