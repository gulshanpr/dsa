package easy;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(0));
    }

    static int sumOfDigits(int n){
        if(n == 0){
            return 0;
        }

        int rem = n % 10;
        int newNo = n / 10;

        return rem + sumOfDigits(newNo);
    }
}
