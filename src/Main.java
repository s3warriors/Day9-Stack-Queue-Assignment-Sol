//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.print("Hello and welcome!");
        // UC1: Stack operations
        Stack<Integer> stack = new Stack<>();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        System.out.println("Stack after push operations:");
        stack.printStack();
        // UC2: Stack peek and pop operations
        while (!stack.isEmpty()) {
            System.out.println("Top element: " + stack.peek());
            System.out.println("Popped: " + stack.pop());
            stack.printStack();
        }

        // UC3: Queue operations
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        System.out.println("Queue after enqueue operations:");
        queue.printQueue();

        // UC4: Queue dequeue operations
        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
            queue.printQueue();
        }
    }
}


