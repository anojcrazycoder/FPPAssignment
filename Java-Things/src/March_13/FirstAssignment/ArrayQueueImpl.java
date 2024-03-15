package March_13.FirstAssignment;

public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    public void enqueue(int obj) {
        if (rear == arr.length)
            resize();
        arr[rear++] = obj;
        if (front == -1)
            front++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int removedItem = arr[front];
        for (int i = 0; i < rear - 1; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        if (rear == 0)
            front = -1;
        return removedItem;
    }

    public boolean isEmpty() {
        return front == -1 || front == rear;
    }

    public int size() {
        return rear - front;
    }

    private void resize() {
        int newSize = arr.length * 2;
        int[] newArray = new int[newSize];
        System.arraycopy(arr, 0, newArray, 0, arr.length);
        arr = newArray;
    }

    public static void main(String[] args) {
        ArrayQueueImpl queue = new ArrayQueueImpl();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Size: " + queue.size());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Is Empty: " + queue.isEmpty());
        System.out.println("Peek: " + queue.peek());
    }
}
