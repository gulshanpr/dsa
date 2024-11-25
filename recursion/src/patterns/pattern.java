package patterns;

import java.util.Arrays;

public class pattern {

    public static void main(String[] args) {
//        pattern(4,0);
        int[] arr = {4,5,3,2,1};
        System.out.println(Arrays.toString(selectionSortUsingTrianglePattern(arr, arr.length, 0, 0)));
        System.out.println(Arrays.toString(arr));
    }

    static void pattern(int row, int column){
        if (row == 0){
            return;
        }

        if(column < row){
            System.out.print("*");
            pattern(row, column + 1);
        } else {
            System.out.println();
            pattern(row - 1, 0);
        }
    }

    static void pattern2(int row, int column){
        if (row == 0){
            return;
        }

        if(column < row){
            pattern2(row, column + 1);
            System.out.print("*");
        } else {
            pattern2(row - 1, 0);
            System.out.println();
        }
    }

    static int[] bubbleSortUsingTrianglePattern(int[] arr, int row, int column){
        // base condition
        if(row == 0){
            return arr;
        }

        // base condition for next line
        if(row > column){

            if(arr[column] > arr[column + 1]){
                int temp = arr[column];
                arr[column] = arr[column + 1];
                arr[column + 1] = temp;
            }

            return bubbleSortUsingTrianglePattern(arr, row, column + 1);

        }

        return bubbleSortUsingTrianglePattern(arr, row - 1, 0);
    }

    static int[] selectionSortUsingTrianglePattern(int[] arr, int row, int column, int max){
        if (row == 0){
            return arr;
        }

        if (row > column){
            if(arr[column] >= arr[max]){
                return selectionSortUsingTrianglePattern(arr, row, column + 1, column);
            }

            return selectionSortUsingTrianglePattern(arr, row, column + 1, max);
        }

        int temp = arr[column - 1];
        arr[column - 1] = arr[max];
        arr[max] = temp;


        return selectionSortUsingTrianglePattern(arr, row - 1, 0, 0);
    }
}
