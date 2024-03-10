import java.util.*;

public class Main {
    private static void testStack(){
        Stack<Integer> stackTest = new Stack<>();
        stackTest.push(1);
        stackTest.push(2);
        System.out.println(stackTest);
        System.out.println(stackTest.peek()); // Used to look at the newest item that is added to the stack
        System.out.println(stackTest.pop()); // LIFO so 2 will be popped first
        System.out.println(stackTest.pop());
    }
    private static void testQueue(){
        Queue<String> newQueue = new LinkedList<>();
        // Queue is an interface, therefore nothing can be instantiated
        newQueue.offer("Hello"); // Adds/enqueues into the queue
        newQueue.offer("World");
        System.out.println(newQueue.contains("World"));
        System.out.println(newQueue.contains("no"));
        System.out.println(newQueue);
        System.out.println(newQueue.poll());
    }
    private static void testPriorityQueue(){
        Queue<Double> testPriority = new PriorityQueue<>(Collections.reverseOrder());
        // Priority Queue -> FIFO data structure that serves elements with the highest priority first before elements with lower priority
        // Collections.reverseOrder() is used to make the Priority Queue a descending queue instead of ascending
        testPriority.offer(1.5);
        testPriority.offer(1.0);
        testPriority.offer(3.5);
        testPriority.offer(2.5);
        testPriority.offer(4.0);

        while(!testPriority.isEmpty()){
            System.out.println(testPriority.poll());
        }

        Queue<String> testStringPriority = new PriorityQueue<>(Collections.reverseOrder());
        testStringPriority.offer("Test");
        testStringPriority.offer("Michael Bay");
        while(!testStringPriority.isEmpty()){
            System.out.println(testStringPriority.poll());
        }
    }
    private static void linkedListTest(){
        LinkedList<String> list = new LinkedList<>();
        list.add(0, "J slander");
        list.add(1,"Hello");
        list.add(2,"Fuck RP");
        list.add(3,"Layla");
        System.out.println(list.indexOf("J slander"));
        list.removeFirst();
        list.removeLast();
        System.out.println(list.peekFirst());
        list.addFirst("World");
        list.addLast("Sg");
        System.out.println(list.peekLast());
        System.out.println(list);
    }
    public static void main(String[] args) {
        testStack();
        testQueue();
        testPriorityQueue();
        linkedListTest();
    }
}