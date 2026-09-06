class Student {

    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}

public class Constructor {

    public static void main(String[] args) {

        Student s1 = new Student("Garima", 20);

        s1.display();
    }
}