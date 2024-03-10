public class LinkedStack<E> implements Stack<E>{
    private final SinglyLinkedList<E> list = new SinglyLinkedList<>();

    @Override
    public void push(E element) { //add first method
        list.addFirst(element);
    }
    @Override
    public E pop() {
        if(isEmpty()) return null;
        return list.removeFirst();
    }
    @Override
    public E top() {
        if(isEmpty()) return null;
        return list.first();
    }
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
    @Override
    public int size() {
        return list.listSize();
    }


}
