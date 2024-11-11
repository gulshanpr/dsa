package array;

import java.util.ArrayList;

public class LinerSearch {

    static int linerSearch(int[] arr, int target, int index){

        if (index > arr.length - 1){
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return linerSearch(arr, target, index + 1);

    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void searchArrayList(int[] arr, int target, int index){
        if (index > arr.length - 1){
            return;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        searchArrayList(arr, target, index + 1);
    }

    static ArrayList<Integer> searchArrayListInParam(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index > arr.length - 1){
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        return searchArrayListInParam(arr, target, index + 1, list);
    }

    public static void main(String[] args) {
        int[] arr = {8,21,134,4,22,21,21, 21};
        int target = 21;
        ArrayList<Integer> list1 = new ArrayList<>();

//        System.out.println(linerSearch(arr, target, 0));
//        searchArrayList(arr, target, 0);
//        System.out.println(list);
        System.out.println(searchArrayListInParam(arr, target, 0, list1));
    }
}
