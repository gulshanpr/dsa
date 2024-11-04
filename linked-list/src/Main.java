public class Main {

    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.addAtFirst(12);
        dll.addAtFirst(22);
        dll.addAtFirst(55);
        dll.addAtFirst(13242);
        dll.addAtFirst(34);
        dll.addAtLast(46);
        dll.addAtLast(45);
        dll.addAtLast(10);
        dll.insertAtAny(10, 31);
        dll.display();
        dll.deleteFromLast();
        dll.display();
        System.out.println(dll.size);
        
        
    }
}