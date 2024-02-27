public class DLinkedList {
    protected Node head;
    protected Node tail;
    int size = 0;
    String error = "List is empty!";
    public void addFirst(int n){
        Node new_node = new Node(n);
        if(head == null){
            head = new_node;
            tail = new_node;
            new_node.setNext(null);
            new_node.setPrev(null);
        } else {
            new_node.setNext(head);
            new_node.setPrev(null);
            head.setPrev(new_node);
            head = new_node;
        }
        size++;
    }

    public void addLast(int n){
        Node new_node = new Node(n);
        if(head == null){
            head = new_node;
            tail = new_node;
            new_node.setPrev(null);
            new_node.setNext(null);
        } else {
            new_node.setPrev(tail);
            tail.setNext(new_node);
            tail = new_node;
        }
        size++;
    }

    public void deleteFirst(){
        if(head == null){ System.out.println(error); }
        else {
            if (head.getNext() != null) {
                head = head.getNext();
                head.setPrev(null);
            } else {
                head = null;
                tail = null;
            }
            size--;
        }
    }

    public void deleteLast(){
        if(head == null) { System.out.println(error); }
        else {
            if(head.getNext() != null){
                tail = tail.getPrev();
                tail.setNext(null);
            } else {
                head = null;
                tail = null;
            }
            size--;
        }
    }

    public void delete(int n) {
        if(head == null) { System.out.println(error); }
        else {
            Node ptr = head;
            while(ptr.getElement() != n){
                ptr = ptr.getNext();
            }
            if(ptr.getElement() != n){
                System.out.println("There is no any node n");
            } else{
                ptr.getNext().setPrev(ptr.getPrev());
                ptr.getPrev().setNext(ptr.getNext());
                size--;
            }
        }
    }

    public Node get_ith(int element) {
        Node ptr = null;
        if (head == null) {
            System.out.println(error);
        } else {
            ptr = head;
            for(int i = 1 ; i<element; i++){
                ptr = ptr.getNext();
            }
        }
        System.out.println(ptr.getElement());
        System.out.println("");
        return ptr;
    }

    public void printList(){
        Node ptr = null;
        if(head == null) { System.out.println(error); }
        else {
            ptr = head;
            while(ptr != null){
                System.out.print(ptr.getElement() + " ");
                ptr = ptr.getNext();
            }
            System.out.println("\n");
        }
    }

    public void insertAfter(Node v, int n) {
        Node new_node = new Node(n);
        Node ptr = head;

        while(ptr.getNext() != v){
            ptr = ptr.getNext();
        }
        ptr.getNext().setPrev(new_node);
        new_node.setNext(ptr.getNext());
        ptr.setNext(new_node);
        new_node.setPrev(ptr);
        size++;
    }
}
