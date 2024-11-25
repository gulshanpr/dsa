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

    // creating arraylist inside the body of the function
    static ArrayList<Integer> searchArrayListInBody(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }

        if (arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> temp = searchArrayListInBody(arr, target, index + 1);

        list.addAll(temp);

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {};
        int target = 3;
        ArrayList<Integer> list1 = new ArrayList<>();

//        System.out.println(linerSearch(arr, target, 0));
//        searchArrayList(arr, target, 0);
//        System.out.println(list);
//        System.out.println(searchArrayListInParam(arr, target, 0, list1));

        System.out.println(searchArrayListInBody(arr, target, 0));
    }
}
