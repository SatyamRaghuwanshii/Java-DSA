package Queue;

public class queueLL {
    public class Node{
        Node next;
        int val;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    private Node start;
    private Node end;
    private int size;

    public queueLL(){
        this.start = null;
        this.end = null;
        this.size = 0;
    }

    public void enqueue(int val){
        Node newNode = new Node(val);
        if(size == 0){
            start = newNode;
            end = newNode;
        }else{
            end.next = newNode;
            end = end.next;
        }
        System.out.println(end.val + " inserted in queue");
        size++;
    }

    public void dequeue(){
        if(start == null){
            System.out.println("stack is empty");
            return;
        }
        System.out.println(start.val + " is removed");
        if(start == end) {
            start = null;
            end = null;
        }else {
            start = start.next;
        }
        size--;
    }

    public Integer peek(){
        if(start == null){
            return null;
        }
        return start.val;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return start == null;
    }

    public static void main(String[] args) {
        queueLL qu = new queueLL();
        qu.dequeue();
        qu.enqueue(30);
        System.out.println(qu.size());
        System.out.println(qu.isEmpty());
        System.out.println(qu.peek());
        qu.dequeue();
        System.out.println(qu.peek());
        System.out.println(qu.isEmpty());
        System.out.println(qu.size());
        qu.enqueue(30);
        qu.dequeue();
        qu.enqueue(50);
    }

}
