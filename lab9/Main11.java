class Instrument {

    void playSound() {
        System.out.println("Instrument sound");
    }
}

class Guitar extends Instrument {

    void playSound() {
        System.out.println("Guitar playing");
    }
}

class Piano extends Instrument {

    void playSound() {
        System.out.println("Piano playing");
    }
}

class Drums extends Instrument {

    void playSound() {
        System.out.println("Drums beating");
    }
}

public class Main11 {

    public static void main(String[] args) {

        Guitar g = new Guitar();
        g.playSound();
    }
}