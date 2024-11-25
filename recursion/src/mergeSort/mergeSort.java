package mergeSort;

import java.util.Arrays;

public class mergeSort {
    static int[] mergeSort(int[] arr){

        int start = 0;
        int end = arr.length - 1;

        if(arr.length == 1){
            return arr;
        }

        int mid = (start + end) / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, start, mid+ 1));
        int[] right = mergeSort (Arrays.copyOfRange(arr, mid + 1, end + 1));

        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right){
        int firstArray = 0;
        int secondArray = 0;
        int newReturnedArray = 0;

        int[] arr = new int[left.length + right.length];

        while ((firstArray < left.length) && (secondArray < right.length)) {
            if(left[firstArray] > right[secondArray]){
                arr[newReturnedArray] = right[secondArray];
                newReturnedArray++;
                secondArray++;
            } else {
                arr[newReturnedArray] = left[firstArray];
                newReturnedArray++;
                firstArray++;
            }
        }

        while(firstArray < left.length){
            arr[newReturnedArray] = left[firstArray];
            newReturnedArray++;
            firstArray++;
        }

        while(secondArray < right.length){
            arr[newReturnedArray] = right[secondArray];
            newReturnedArray++;
            secondArray++;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {-32,5,1,0,-32,-32,-354,6,7,7,7,7};

        System.out.println(Arrays.toString(mergeSort(arr)));
    }

}
