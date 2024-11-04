public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    public void addAtFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;

        if(tail == null){
            tail = head;
        }

        size++;
    }

    public void addAtAny(int value, int index){
        if (index == 0) {
            addAtFirst(value);
            return;
        }
        if (index == size) {
            addAtLast(value);
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(value, temp.next);
        temp.next = newNode;

        size++;
    }

    public void addAtLast(int value){
        if(tail == null){
            addAtFirst(value);
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    // insert using recursive
    

    public int deleteAtFirst() {
        if(head == null || tail == null){
            return 0;
        }
        if (head.next == null){
            tail = null;
        }

        int val = head.data;
        head = head.next;
        size --;
        return val;
    }

    public int deleteAtLast(){
        if (size <= 1) {
            return deleteAtFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.data;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;

    }

    public int deleteAny(int index) {
        if(index == 0){
            return deleteAtFirst();
        }
        if (index == size - 1){
            return deleteAtLast();
        }

        Node temp = get(index - 1);
        int val = temp.next.data;
        temp.next = temp.next.next;
        size--;
        return val;
    }

    public Node find(int value) {
       Node node = head;
       while (node != null) {
            if(node.data == value) {
                return node;
            }
            node = node.next;
       }
       return null;
    }

    public Node get(int index) {
        Node temp = head;

        for (int i = 1; i <= index; i++) {
            temp = temp.next;
        }

        return temp;

    }

    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    public Node reverseList() {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }


    public static void main(String[] args) {
        LL ll = new LL();
        ll.addAtFirst(5);
        ll.addAtFirst(4);
        ll.addAtFirst(3);
        ll.addAtFirst(2);
        ll.addAtFirst(1);
        // ll.addAtLast(25);
        // ll.addAtLast(93);

        // ll.addAtAny(2, 4);
        // ll.display();
        // System.out.println(ll.size);
        // // System.out.println(ll.deleteAtFirst());
        // // System.out.println(ll.deleteAtLast());
        // // System.out.println(ll.deleteAny(2));
        ll.display();
        ll.reverseList();
        ll.display();
        // System.out.println(ll.size);
        // System.out.println(ll.find(55));
        int ans = 5/2;
        System.out.println();
        
    }

    


}
