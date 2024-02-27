public class LinkedList {
    protected Node head,tail;
    protected int size;

    public LinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertTail(int new_node){
        Node new_element = new Node(new_node);
        if(head == null){
            head = new_element;
            tail = new_element;
        } else{
            tail.setNext(new_element);
            tail = new_element;
        }
    }
    public void removeTail(){
        if(head == null){
            System.out.println("List is empty.");
        }
        if(head == tail){
            head = tail = null;
            return;
        }
        Node ptr = head;
        while(ptr.getNext() != tail){
            ptr = ptr.getNext();
        }
        ptr.setNext(null);
        tail = ptr;
    }
    public void addFirst(int new_node){
        Node new_element = new Node(new_node);
        new_element.setNext(head);
        head = new_element;
        size++;
    }

    public void insertAfter(Node v, int new_node){
        Node new_element = new Node(new_node);
        new_element.setNext(v.getNext());
        v.setNext(new_element);
        size++;
    }

    Node get(int i){
        Node ptr = head;
        for(int j=0 ; j<i ; j++){
            ptr = ptr.getNext();
        }
        return ptr;
    }

    Node removeFirst(){
        Node ptr = head;
        head = head.getNext();
        ptr.setNext(null);
        size--;
        return ptr;
    }

    public void addLast(int new_node){
        Node new_element = new Node(new_node);
        if(head == null){
            head = new_element;
            return;
        }
        Node ptr = head;
        while(ptr.getNext() != null){
            ptr = ptr.getNext();
        }
        ptr.setNext(new_element);
        new_element.setNext(null);
        tail = new_element;
        size++;
    }

    public void removeLast(){
        Node ptr = head;
        while(ptr.getNext().getNext() != null){
            ptr = ptr.getNext();
        }
        ptr.setNext(null);
        size--;
    }
    public void printList(){
        System.out.println("Elements of list: ");
        Node ptr = head;
        while(ptr != null){
            System.out.print(ptr.getElement() + " ");
            ptr = ptr.getNext();
        }
        System.out.println();
    }
}
