public class Main {
    public static void main(String[] args) {
        Stack<Integer> linkedStack = new LinkedStack<>();
        linkedStack.push(5); // contents: (5)
        linkedStack.push(3); // contents: (5, 3)
        System.out.println(linkedStack.size()); // contents: (5, 3) outputs 2
        System.out.println(linkedStack.pop()); // contents: (5) outputs 3
        System.out.println(linkedStack.isEmpty()); // contents: (5) outputs false
        System.out.println(linkedStack.pop()); // contents: () outputs 5
        System.out.println(linkedStack.isEmpty()); // contents: () outputs true
        // System.out.println(S.pop()); // contents: () outputs null
        linkedStack.push(7); // contents: (7)
        linkedStack.push(9); // contents: (7, 9)
        System.out.println(linkedStack.top()); // contents: (7, 9) outputs 9
        linkedStack.push(4); // contents: (7, 9, 4)
        System.out.println(linkedStack.size()); // contents: (7, 9, 4) outputs 3
        System.out.println(linkedStack.pop()); // contents: (7, 9) outputs 4
        linkedStack.push(6); // contents: (7, 9, 6)
        linkedStack.push(8); // contents: (7, 9, 6, 8)
        System.out.println(linkedStack.pop()); // contents: (7, 9, 6) outputs 8
    }
}