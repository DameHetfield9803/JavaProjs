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
    public static int linearSearch(int[] array, int val){
        for(int i =0; i< array.length; ++i){
            if(array[i] == val){
                return i;
            }
        }
        return -1;
    }
    private static int binarySearch(int[] array, int target){
        int low = 0;
        int high = array.length -1;
        while(low <= high){
            int middle = low + (high-low) / 2;
            int value = array[middle];
            System.out.println("Middle: " + value);
            if(value < target)
                low = middle + 1;
            else if(value > target)
                high = middle -1;
            else
                return middle;
        }
        return -1;
    }
    private static void binarySearchExample(){
        int array[] = new int[1000000000];
        int target = 999999999;
        for(int i =0; i < array.length; ++i){
            array[i] = i;
        }
        int index = binarySearch(array, target);
        if(index == -1)
            System.out.println(target + " not found");
        else
            System.out.println("Element found at: " + index);
    }
    private static int interpolationSearchExample(int[] array, int value){
        int upper = array.length-1;
        int low = 0;
        while(value >= array[low] && value <= array[upper] && low <= upper){
            int probe = low + (upper - low) * (value - array[low]) / (array[upper] - array[low]);
            if(array[probe] == value) {
                return probe;
            }
            else if (array[probe] < value) {
                low = probe + 1;
            }
            else {
                upper = probe - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        testStack();
        testQueue();
        testPriorityQueue();
        linkedListTest();
        dynamicArray dynamicArray = new dynamicArray();
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.insert(3, "D");
        dynamicArray.delete("D");
        System.out.println(dynamicArray.search("B"));
        System.out.println("Is the list empty? : " + dynamicArray.isEmpty());
        System.out.println("Array size: " + dynamicArray.size);
        System.out.println("Dynamic array capacity: " + dynamicArray.capacity);
        System.out.println(dynamicArray);
        int [] array = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
        int index = interpolationSearchExample(array,3);
        if(index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found");
    }
}