package lab9;

class Person {

    String name;

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {

    Student(String name) {
        super(name);
    }

    void study() {
        System.out.println(name + " is studying.");
    }
}

class Teacher extends Person {

    Teacher(String name) {
        super(name);
    }

    void teach() {
        System.out.println(name + " is teaching.");
    }
}

class Administrator extends Person {

    Administrator(String name) {
        super(name);
    }

    void manage() {
        System.out.println(name + " manages the school.");
    }
}

public class Main4 {

    public static void main(String[] args) {

        Student s = new Student("Ali");
        Teacher t = new Teacher("Mr. Smith");

        s.study();
        t.teach();
    }
}