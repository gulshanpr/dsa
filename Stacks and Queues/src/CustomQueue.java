public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = -1;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public void insert(int value) throws Exception {
        if (isFull()) {
            throw new Exception("Full");
        }

        end++;
        data[end] = value;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Empty stack");
        }
        int removedItem = data[0];
        for (int i = 1; i <= end; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return removedItem;
    }

    public void print(){
        for (int i = 0; i <= end; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Empty queue do not have peek value");
        }
        return data[0];
    }

    public CustomQueue(int size){
        data = new int[size];
    }

    public boolean isFull(){
        return end == data.length - 1;
    }

    public boolean isEmpty(){
        return end == -1;
    }


}
