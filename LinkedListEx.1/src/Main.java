public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(15);
        list.addLast(35);
        list.addLast(45);
        list.addLast(12);
        list.addLast(7);
        list.addLast(8);
        list.addLast(13);
        list.printList();

        list.insertAfter(list.head.getNext(),44);
        list.removeFirst();
        list.removeLast();
        list.printList();
        list.insertTail(100);
        list.removeTail();
        list.printList();
    }
}