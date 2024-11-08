package easy;

public class Nto1 {
    public static void main(String[] args) {
        printBoth(5);
    }

    static void print(int n) {
        if (n == 1){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        print(n - 1);
    }

    static void printRev(int n) {
        if (n == 1 ) {
            System.out.println(n);
            return;
        }

        printRev(n - 1);
        System.out.println(n);
    }

    static void printBoth(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }

        System.out.println(n);
        printBoth(n - 1);
        System.out.println(n);
    }
}
