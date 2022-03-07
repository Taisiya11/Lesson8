public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(54);
        stack.push(3);
        stack.push(1);
        stack.push(6);
        stack.pop();
        stack.print();

        Queue queue = new Queue();
        queue.push("p");
        queue.push("r");
        queue.push("i");
        queue.push("v");
        queue.push("e");
        queue.push("t");
        queue.pop();
        queue.pop();
        queue.print();
    }
}
