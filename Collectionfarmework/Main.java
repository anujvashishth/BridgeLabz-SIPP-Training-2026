import java.util.*;

// Generic Pair Class
class Generics<T, U> {
    private T first;
    private U second;

    public Generics(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
class Stack<T> {
    private ArrayList<T> list = new ArrayList<>();

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        if (list.isEmpty()) {
            throw new EmptyStackException();
        }
        return list.remove(list.size() - 1);
    }

    public T peek() {
        if (list.isEmpty()) {
            throw new EmptyStackException();
        }
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}

// Generic Repository Class
class Repository<T> {
    private ArrayList<T> data = new ArrayList<>();

    public void add(T item) {
        data.add(item);
    }

    public void display() {
        for (T item : data) {
            System.out.println(item);
        }
    }
}

public class Main {

    // Generic Method with Comparable Bound
    public static <T extends Comparable<T>> T findMax(T[] arr) {
        T max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }

        return max;
    }

    // Wildcard Utility Method
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Pair Demo
        Generics<String, Integer> pair = new Generics<>("Anuj", 101);
        System.out.println("Pair: " + pair);

        // Stack Demo
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top Element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top after Pop: " + stack.peek());

        // findMax Demo
        Integer[] numbers = {12, 45, 67, 23, 89, 10};
        System.out.println("Maximum Number: " + findMax(numbers));

        String[] names = {"Ram", "Shyam", "Anuj", "Zoya"};
        System.out.println("Maximum String: " + findMax(names));

        // Repository Demo
        Repository<String> repo = new Repository<>();
        repo.add("Laptop");
        repo.add("Mobile");
        repo.add("Tablet");

        System.out.println("Repository Data:");
        repo.display();

        // Wildcard Demo
        List<Integer> intList = Arrays.asList(10, 20, 30);
        List<String> strList = Arrays.asList("Java", "Python", "SQL");

        System.out.println("Integer List:");
        printList(intList);

        System.out.println("String List:");
        printList(strList);
    }
} 