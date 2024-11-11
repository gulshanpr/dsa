package array;

public class Sorted {

    static boolean sort(int[] arr, int start, int end){
        if(start >= end){
            return true;
        }

        return arr[start] < arr[start + 1] && sort(arr, start + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int length = arr.length;

        System.out.println(sort(arr, 0, length - 1));
    }
}
