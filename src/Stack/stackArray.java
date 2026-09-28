package Stack;

public class stackArray {
    public static class Stack{

            int[] stack;
            int top;
            int size;

            Stack(int n){
                stack = new int[n];
                top = -1;
                size = 0;
            }

            void push ( int n){
                if (top == stack.length-1) {
                    System.out.println("stack is full");
                    return;
                }
                top++;
                size++;
                stack[top] = n;
            }
            void pop () {
                if (isEmpty()) {
                    System.out.println("stack is empty");
                    return;
                }
                top--;
                size--;
            }
            int peek () {
                if (top == -1) {
                    return -1;
                } else {
                    return stack[top];
                }
            }
            boolean isEmpty () {
                if (size == 0) {
                    return true;
                } else {
                    return false;
                }
            }
    }

    static void main() {
        Stack s1 = new Stack(10);
        s1.push(10);
        System.out.println(s1.peek());
        System.out.println(s1.isEmpty());
        s1.pop();
        s1.push(20);
        s1.push(15);
        System.out.println(s1.peek());
    }

}


