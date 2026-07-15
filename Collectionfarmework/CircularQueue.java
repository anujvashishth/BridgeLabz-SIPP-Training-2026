public class CircularQueue {

    private int[] data;
    private int front, count;

    public CircularQueue(int capacity) {
        data = new int[capacity];
        front = 0;
        count = 0;
    }

    public boolean enqueue(int x) {
        if (count == data.length)
            return false;

        data[(front + count) % data.length] = x;
        count++;
        return true;
    }

    public int dequeue() {
        if (count == 0)
            throw new RuntimeException("Queue is Empty");

        int val = data[front];
        front = (front + 1) % data.length;
        count--;
        return val;
    }

    public boolean isFull() {
        return count == data.length;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(3);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue()); // 10
        System.out.println(q.dequeue()); // 20

        q.enqueue(40);

        System.out.println(q.dequeue()); // 30
        System.out.println(q.dequeue()); // 40
    }
}