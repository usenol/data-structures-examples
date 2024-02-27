public class Node {
    public Node head;
    protected int element;
    protected Node next;
    protected Node prev;

    public Node(int element){
        this.element = element;
        this.next = null;
        this.prev = null;
    }
    public int getElement(){ return element; }
    public void setElement(int element){ this.element = element; }
    public Node getNext(){ return next; }
    public void setNext(Node next){ this.next = next; }
    public Node getPrev(){ return prev; }
    public void setPrev(Node prev){ this.prev = prev; }
}
