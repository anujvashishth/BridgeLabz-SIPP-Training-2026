class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override toString()
    @Override
    public String toString() {
        return "Person [Name = " + name + ", Age = " + age + "]";
    }
}

class Student extends Person {
    final int studentId;   // final attribute
    double gpa;

    // Constructor
    Student(String name, int age, int studentId, double gpa) {
        super(name, age);   // Call Person constructor
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Student [ID = " + studentId +
                ", GPA = " + gpa + "]";
    }
}

class GradStudent extends Student {
    String thesis;

    // Constructor
    GradStudent(String name, int age, int studentId,
                double gpa, String thesis) {

        super(name, age, studentId, gpa); 
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", GradStudent [Thesis = " + thesis + "]";
    }
}

public class university{
    public static void main(String[] args) {

        GradStudent gs = new GradStudent(
                "Anuj", 22, 101, 9.2,
                "Artificial Intelligence");
        System.out.println(gs);
        Student s = gs;
        Person p = gs;

        System.out.println("\nIS-A Relationship:");
        System.out.println("GradStudent IS-A Student : " + (s instanceof Student));
        System.out.println("GradStudent IS-A Person  : " + (p instanceof Person));
        System.out.println("GradStudent IS-A GradStudent : " + (gs instanceof GradStudent));
    }
}
