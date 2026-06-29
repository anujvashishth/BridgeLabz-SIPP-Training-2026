interface A {
    default void display(){
        System.out.println("A");
    }
    
}
interface B {
    default void display() {
        System.out.println("B");
    }
}

class C implements A, B {
    @Override
    public void display(){
        System.out.println("C");
    }
}
public class Otherclass{
    public static void main(String[] args) {
        System.out.println("C");
    }
}
