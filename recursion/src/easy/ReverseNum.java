package easy;

public class ReverseNum {
    public static void main(String[] args) {
        System.out.println(revNumWay4(12345));
//        System.out.println(num);
    }

    static int num = 0;
    static void revNumWay1(int n){
        if (n == 0) {
            return;
        }

        int rem = n % 10;
        num = num * 10 + rem;
        revNumWay1(n/10);
    }

//    the second way is to take the base for multiple the digit to shift it to right
//    static int baseForDigits = 0;
//    static void revNumWay2(int n){}

//    the third way is to take the base inside the function argument
//    static int revNumWay3(int n, int baseForDigit){}

//    fourth way is to use the helper function
    static int revNumWay4(int n){
        int digits = (int)(Math.log10(n)) + 1;

        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n == 0){
            return n;
        }
        int rem = n % 10;

        return rem * (int)Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
    }
}
