public class SinglyLinkedList<E> {
    Node<E> head;
    int size;

    public SinglyLinkedList() { //constructor
        this.head = null;
        this.size = 0;
    }

    public void addFirst(E data){ //push
        Node<E> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }

    public E removeFirst() throws IllegalStateException { //pop
        if(head == null) throw new IllegalStateException("List is empty");
        Node<E> temp = head;
        head = head.getNext();
        size--;
        return temp.getElement();
    }

    public E first(){ //top(peek)
        return head.getElement();
    }

    public boolean isEmpty(){
        return (head == null);
    }

    public int listSize(){
        return size;
    }

}
