

public class CircularQueue {
    protected int[] data;
    protected static final int DEFAULT_SIZE = 10;

    protected int start = 0;
    protected int end = 0;
    protected int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size){
        data = new int[size];
    }

    public void insert(int item) throws Exception{
        if(isFull()){
            throw new Exception("Queue is Full");
        }
        data[end] = item;
        end++;
        end = end % data.length;
        size++;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removedItem = data[start];
        start++;
        start = start % data.length;
        size--;
        return removedItem;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private boolean isEmpty(){
        return size == 0;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Empty stack");
        }
        return data[start];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("EMPTY");
            return;
        }
        int i = start;

        do {
            System.out.print(data[i] + " <- ");
            i++;
            i = i % data.length;
        } while(i != end);
        System.out.println("END");
    }

}
