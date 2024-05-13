package package2;

    public class Stack {
        private int maxSize;
        private int[] stackArray;
        private int top;

        public Stack(int size) {
            maxSize = size;
            stackArray = new int[maxSize];
            top = -1;
        }

        public void push(int value) {
            if (top == maxSize - 1) {
                System.out.println("Cannot push element into a full stack.");
                return;
            }
            stackArray[++top] = value;
            System.out.println("Pushed " + value );
        }

        public int pop() {
            if (top == -1) {
                System.out.println("Cannot pop element from an empty stack.");
                return -1;
            }
            int poppedElement = stackArray[top--];
            System.out.println("Popped " + poppedElement );
            return poppedElement;
        }


        public boolean isEmpty() {
            return (top == -1);
        }

        public boolean isFull() {
            return (top == maxSize - 1);
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return -1;
            }
            return stackArray[top];
        }


        public static void main(String[] args) {
            Stack stack1 = new Stack(5);
            Stack stack2 = new Stack(5);


            // Push elements onto the stack
            stack1.push(10);
            stack1.push(20);
            stack1.push(30);
            stack2.push(40);
            stack2.push(50);
            stack2.push(60);

            stack1.pop();
            stack1.pop();
            stack1.pop();
            stack2.pop();
            stack2.pop();


            stack1.pop();
        }
    }


