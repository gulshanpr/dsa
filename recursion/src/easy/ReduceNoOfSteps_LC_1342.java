package easy;

public class ReduceNoOfSteps_LC_1342 {

    static int totalSteps(int n, int count){
        if (n == 0 ){
            return count;
        }

        if (n < 0){
            return 0;
        }

        if (n % 2 == 0){
            return totalSteps(n / 2, count + 1);
        }

        return totalSteps(n - 1, count + 1);
    }

    public static void main(String[] args) {
        System.out.println(totalSteps(-11, 0));
    }
}
