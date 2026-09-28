package Queue;

public class queueArray {
    public class Queue{
        int[] queue;
        int start;
        int end;
        int size;
        Queue(int n){
            queue = new int[n];
            start = -1;
            end = -1;
            size = 0;
        }
        void enqueue(int n){
            if(size == queue.length){
                System.out.println("queue is full");
                return;
            }
            if(size == 0){
                start++;
            }
            end = (end+1)%queue.length;
            queue[end] = n;
            size++;
            System.out.println("pushed " + n);
        }
        void dequeue(){
            if(size == 0){
                System.out.println("queue is empty");
                return;
            }
            size--;
            if(start == end){
                start = -1;
                end = -1;
                return;
            }
            start = (start+1)%queue.length;
        }
        int peek(){
            if(size == 0){
                System.out.println("queue is empty");
                return -1;
            }
            return queue[start];
        }
    }

    void main() {
        Queue q1 = new Queue(4);
        q1.dequeue();
        q1.enqueue(12);
        System.out.println(q1.peek());
        q1.enqueue(92);
        q1.enqueue(1);
        q1.enqueue(1234);
        q1.enqueue(152);
        q1.dequeue();
        System.out.println(q1.peek());
    }
}
