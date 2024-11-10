package easy;

public class CountNoOfZeros {
    // special question how to pass no to above function
    static int noOfZero(int n, int count){
        if( n == 0){
            return count;
        }

        int rem = n % 10;
        if (rem == 0){
            return noOfZero(n / 10, count + 1);
        }

        return noOfZero(n / 10, count);
    }

    public static void main(String[] args) {
        System.out.println(noOfZero(306700750, 0));
    }
}
