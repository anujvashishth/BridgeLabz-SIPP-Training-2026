public class simpleDeque {
    private static class Node {
        int val;
        Node prev, next;
        Node(int val);
        this.val = val;  
    }
    private Node head, tail;
    void addFirst(int x) {
    Node n = new Node(x);
    n.next = head;
    if (head != null) head.prev = n;
    head = n;
    if (tail == null) tail = n;
    }
    void addLast(int x) {
    Node n = new Node(x);
    n.prev = tail;
    if (tail != null) tail.next = n;
    tail = n;
    if (head == null) head = n;
    }
    int removeFirst() {
    int val = head.val;
    head = head.next;
    if (head != null) head.prev = null; else tail = null;
    return val;
    }
    int removeLast() {
        int val = tail.val;
        tail = tail.prev;
        if (tail != null) tail.next = null; else head = null;
        return val;
    }
    public static void main(String[] args) {
        SimpleDeque dq = new SimpleDeque();

        dq.addFirst(20);
        dq.addFirst(10);
        dq.addLast(30);
        dq.addLast(40);

        System.out.print("Deque: ");
        dq.display();

        System.out.println("Front: " + dq.peekFirst());
        System.out.println("Rear: " + dq.peekLast());

        System.out.println("Removed First: " + dq.removeFirst());
        System.out.println("Removed Last: " + dq.removeLast());

        System.out.print("Deque after removals: ");
        dq.display();
    }
}
