package March_13.SecondAssignment;

public class LinkedListStackDemo {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    private ListNode head;
    private int size;

    public LinkedListStackDemo() {
        head = new ListNode(0);
        size = 0;
    }

    public void push(int val) {
        ListNode toAdd = new ListNode(val);
        toAdd.next = head.next;
        head.next = toAdd;
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // or throw an exception
        }
        int poppedValue = head.next.val;
        head.next = head.next.next;
        size--;
        return poppedValue;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // or throw an exception
        }
        return head.next.val;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        LinkedListStackDemo stack = new LinkedListStackDemo();
        stack.push(800);
        stack.push(300);
        stack.push(900);
        stack.push(200);

        // pop
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Size: " + stack.size());
    }
}
