class Component {

    void showInfo() {
        System.out.println("Computer component");
    }
}

class CPU extends Component {

    void showInfo() {
        System.out.println("CPU processes data");
    }
}

class RAM extends Component {

    void showInfo() {
        System.out.println("RAM stores temporary data");
    }
}

class GPU extends Component {

    void showInfo() {
        System.out.println("GPU handles graphics");
    }
}

public class Main8 {

    public static void main(String[] args) {

        CPU cpu = new CPU();
        cpu.showInfo();
    }
}