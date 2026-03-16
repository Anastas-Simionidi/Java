package lab9;

class Employee {

    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void work() {
        System.out.println(name + " is working.");
    }
}

class Manager extends Employee {

    Manager(String name, int salary) {
        super(name, salary);
    }

    void work() {
        System.out.println(name + " manages the team.");
    }
}

class Developer extends Employee {

    Developer(String name, int salary) {
        super(name, salary);
    }

    void work() {
        System.out.println(name + " writes code.");
    }
}

class Designer extends Employee {

    Designer(String name, int salary) {
        super(name, salary);
    }

    void work() {
        System.out.println(name + " creates design.");
    }
}

public class Main2 {

    public static void main(String[] args) {

        Developer dev = new Developer("Alex", 5000);
        Manager man = new Manager("John", 7000);

        dev.work();
        man.work();
    }
}