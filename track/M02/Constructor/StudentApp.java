public class Student {
    String name;
    int age;
    double height;

    Student(String name, int age, double height) {
        name = "Anu";
        age = 19;
        height = 4.9;
    }

    Student() {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

public class StudentApp {

    public static void main(String[] args) {
        Student s1 = new Student("Raja", 18, 5.5);
        s1.display();
    }
}