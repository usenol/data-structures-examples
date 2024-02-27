public class Main {
    public static void main(String[] args) {
        DLinkedList dLinkedList = new DLinkedList();

        dLinkedList.addFirst(15);
        dLinkedList.addLast(20);
        dLinkedList.addLast(25);
        dLinkedList.addLast(30);
        dLinkedList.addLast(35);
        dLinkedList.addLast(40);
        dLinkedList.addLast(45);
        dLinkedList.addFirst(10);
        dLinkedList.printList();
        dLinkedList.deleteFirst();
        dLinkedList.deleteLast();
        dLinkedList.printList();
        dLinkedList.get_ith(4);
        dLinkedList.delete(30);
        dLinkedList.printList();
        dLinkedList.insertAfter(dLinkedList.head.getNext().getNext(),100);
        dLinkedList.printList();

    }
}