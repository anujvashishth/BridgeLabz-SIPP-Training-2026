class UndoStack {
    private String[] stack;
    private int top;
    private int capacity;

    public UndoStack(int capacity) {
        this.capacity = capacity;
        stack = new String[capacity];
        top = -1;
    }
    public void push(String action) {
        if (top == capacity - 1) {
            for (int i = 1; i < capacity; i++) {
                stack[i - 1] = stack[i];
            }
            stack[capacity - 1] = action;
        } else {
            stack[++top] = action;
        }
    }
    public String pop() {
        if (isEmpty()) {
            return "Nothing to undo";
        }
        return stack[top--];
    }
    public String peek() {
        if (isEmpty()) {
            return "Stack is empty";
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Undo buffer is empty");
            return;
        }

        System.out.println("Undo Buffer:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
public class Stack {
    public static void main(String[] args) {
         UndoStack undo = new UndoStack(5);

        undo.push("Type A");
        undo.push("Type B");
        undo.push("Delete B");
        undo.push("Type C");
        undo.push("Bold C");

        undo.display();

        System.out.println("\nUndo: " + undo.pop());

        undo.push("Italic A");
        undo.push("Underline A"); 

        System.out.println("\nCurrent Undo Buffer:");
        undo.display();
    }
}

