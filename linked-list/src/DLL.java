public class DLL {
    private Node head;
    protected int size;

    public void addAtFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        size++;
    }

    public void addAtLast(int value) {
        Node temp = head;
        Node node = new Node(value);
        node.next = null;

        if (head == null) {
            head = node;
            node.prev = null;
            return;
        }
        while(temp.next != null) {
            temp = temp.next;
        }

        node.prev = temp;
        temp.next = node;
        size++;
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

    public void insertAtAny(int after, int value) {
        Node temp = find(after);
        if (temp == null) {
            System.out.println("node does not exists");
            return;
        }
        Node newNode = new Node(value);

        newNode.prev = temp;
        newNode.next = temp.next;
        temp.next = newNode;
        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }
        size++;
    }

    public void deleteFromFirst() {
        head = head.next;
        if(head != null) {
            head.prev = null;
        }
        size--;
    }

    public void deleteFromLast() {
        if(size == 1) {
            deleteFromFirst();
        }
        Node temp = get(size - 2);
        temp.next.prev = null;
        temp.next = null;
        size--;
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
        Node last = null;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("Printing in Start");
        while(last != null) {
            System.out.print(last.data + " -> ");
            last = last.prev;
        }

        System.out.println("START");
    }

    private class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data){
            this.data = data;
        }

        // public Node(int data, Node prev, Node next) {
        //     this.data = data;
        //     this.prev = prev;
        //     this.next = next;
        }
    }   
}
