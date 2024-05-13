package package3;
import package2.Stack;


public class TwoStacksQueue {

        private Stack stack1;
        private Stack stack2;

        public TwoStacksQueue(int maxSize) {
            stack1 = new Stack(maxSize);
            stack2 = new Stack(maxSize);
        }

        public void enqueue(int value) {
            stack1.push(value);
        }

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }

            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }

            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.peek();
        }

        public boolean isEmpty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }

        public boolean isFull() {
            return stack1.isFull() || stack2.isFull();
        }

        public static void main(String[] args) {
            TwoStacksQueue queue = new TwoStacksQueue(5);


            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);


            System.out.println("Dequeued: " + queue.dequeue());
            System.out.println("Dequeued: " + queue.dequeue());


            System.out.println("Peek: " + queue.peek());
        }
    }


