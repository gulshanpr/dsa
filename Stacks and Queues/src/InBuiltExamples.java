import java.util.*;

public class InBuiltExamples {
    public static void main(String[] args) {

//        Stack<Integer> stack = new Stack<>();
//        stack.push(0);
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//
//        System.out.println(stack.peek());
//        System.out.println(stack.empty());
//        System.out.println(stack.search(4));

//
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(0);
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//        queue.add(5);
//
//        System.out.println(queue.peek());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.peek());
//        System.out.println(queue.poll());

        Deque<Integer> deque = new ArrayDeque<>();
        // ArrayDeque is a re-sizeable array that has no restriction over size
        // and this is faster than stack and queue implementation as linked-list
        // insertion and deletion  can be done from last and front both
        deque.addFirst(0);
        deque.addLast(1);

        System.out.println(deque.removeLast());
        System.out.println(deque.removeFirst());

    }

}
