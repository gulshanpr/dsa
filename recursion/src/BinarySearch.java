public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,6,9,11,56, 77};
        int target = 11;
        System.out.println(binarySearch(arr, target, 0, 6));

    }

    static int binarySearch(int[] arr, int target, int start, int end){
        int mid = start + (end -start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] > target) {
            return binarySearch(arr, target, start, mid - 1);
        }

        if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, end);
        }

        return -1;

    }
}
