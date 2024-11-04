public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE  = 10;

    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) throws StackException{
        if(isFull()){
            throw new StackException("Stack is Full my love");
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Stack is Empty my love can empty it more");
        }

        int removedItem = data[ptr];
        ptr--;
        return removedItem;

    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Stack is Empty my love there is no peek anymore");
        }

        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }


}
