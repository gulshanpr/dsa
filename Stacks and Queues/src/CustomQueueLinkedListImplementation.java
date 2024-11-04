public class CustomQueueLinkedListImplementation {
   private int[] data;
   private static final int DEFAULT_SIZE = 10;

   private int head = -1;

   public CustomQueueLinkedListImplementation(){
       this(DEFAULT_SIZE);
   }

   public CustomQueueLinkedListImplementation(int size){
       data = new int[size];
   }

   public void insert(int item) throws Exception {
       if(isFull()){
           throw new Exception("Empty");
       }
       head++;
       data[head] = item;
   }

   private boolean isFull(){
       return head == data.length - 1;
   }

    private boolean isEmpty(){
        return head == -1;
    }



}
