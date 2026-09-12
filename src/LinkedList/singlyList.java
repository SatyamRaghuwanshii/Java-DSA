package LinkedList;

public class singlyList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public singlyList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // insertion at head;
    public void InsertAtHead(int data){
        Node newNode = new Node(data);
        if(size == 0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    // insertion at tail;
    public void insertAtTail(int data){
        Node newNode = new Node(data);
        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    //insert at specific position;
    public void insertAtPosition(int pos,int data){
        if(pos < 1 || pos > size+1){
            System.out.println("invalid position");
            return;
        }
        else if(pos == 1){
            InsertAtHead(data);
        }
        else if(pos == size+1){
            insertAtTail(data);
        }
        Node newNode = new Node(data);
        Node prev = head;
        for(int i = 1; i < pos-1; i++){
            prev = prev.next;
        }
        newNode.next = prev.next;
        prev.next = newNode;
        size++;
    }

    //isEmpty
    public boolean isEmpty(){
        return head == null;
    }
    //traversing in LL
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println();
    }
    //getSize;
    public int getSize() {
        return size;
    }
    //getHead;
    public int getHead() {
        if(head == null){
            return -1;
        }else {
            return head.data;
        }
    }
    //getTail
    public int getTail() {
        if (tail == null) {
            return -1;
        } else {
            return tail.data;
        }
    }
    //clear

    //searching
    public boolean search(int target){
        Node temp = head;
        while(temp != null){
            if(temp.data == target){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    //searching position
    public int searchPostion(int target){
        Node temp = head;
        int count = 1;
        while(temp != null){
            if(temp.data == target){
                return count;
            }
            count++;
            temp = temp.next;
        }
        return -1;
    }
    //deletion at head
    public void deleteAtHead(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        head = head.next;
        size--;

        if(size == 0){
            tail = null;
        }
    }
    // deletion at end;
    public void deleteAtEnd(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        if(size == 1){
            head = null;
            tail = null;
            size--;
            return;
        }

        Node temp = head;

        while(temp.next != tail){
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
        size--;
    }
    // deletion at specific pos
    public void deleteAtPosition(int pos){
        if(pos < 1 || pos > size){
            System.out.println("Invalid position");
            return;
        }

        if(pos == 1){
            deleteAtHead();
            return;
        }

        if(pos == size){
            deleteAtEnd();
            return;
        }

        Node prev = head;

        for(int i = 1; i < pos - 1; i++){
            prev = prev.next;
        }

        prev.next = prev.next.next;
        size--;
    }

    static void main() {
        singlyList myList = new singlyList();
        if(myList.isEmpty()) {
            System.out.println("list is empty");
        }

        System.out.println("Initially empty: " + myList.isEmpty());

        myList.InsertAtHead(10);
        myList.InsertAtHead(20);
        myList.insertAtTail(30);
        myList.insertAtTail(40);

        System.out.print("After insertion: ");
        myList.printList();

        System.out.println("Size: " + myList.getSize());
        System.out.println("Head: " + myList.getHead());
        System.out.println("Tail: " + myList.getTail());

        System.out.println("Search 30: " + myList.search(30));
        System.out.println("Search 50: " + myList.search(50));

        System.out.println("Position of 30: " + myList.searchPostion(30));
        System.out.println("Position of 50: " + myList.searchPostion(50));

        myList.deleteAtHead();
        System.out.print("After delete head: ");
        myList.printList();

        myList.deleteAtEnd();
        System.out.print("After delete end: ");
        myList.printList();

        myList.deleteAtPosition(2);
        System.out.print("After delete position 2: ");
        myList.printList();
    }
}
