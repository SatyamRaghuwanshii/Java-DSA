package Stack;

public class stack {
    public class Node {
        int val;
        Node next;
        Node(int val){
            this.next = null;
            this.val = val;
        }
    }

    private Node top;
    private int size = 0;

    public stack(){
        this.top = null;
    }

    public void push(int val){
        Node newNode = new Node(val);
        if(top == null){
            top = newNode;
        }else {
            newNode.next = top;
            top = newNode;
        }
        size++;
        System.out.println("pushed " + val + " successfully");
    }

    public void pop(){
        if(top == null) {
            System.out.println("stack is empty");
            return;
        }

        System.out.println("poped "+ top.val + " successfully");
        top = top.next;
        size--;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public int size(){
        return size;
    }
    public Integer peek(){
        if(top == null){
            return null;
        }
        return top.val;
    }

    public void main() {
        stack st = new stack();
        st.pop();
        System.out.println(st.peek());
        st.push(20);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }

}

