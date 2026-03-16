class Course {

    void startCourse() {
        System.out.println("Course started");
    }
}

class ProgrammingCourse extends Course {}
class MathCourse extends Course {}
class HistoryCourse extends Course {}

public class Main12 {

    public static void main(String[] args) {

        ProgrammingCourse pc = new ProgrammingCourse();
        pc.startCourse();
    }
}