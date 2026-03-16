class TeamMember {}

class Player extends TeamMember {

    void play() {
        System.out.println("Player plays");
    }
}

class Coach extends TeamMember {

    void train() {
        System.out.println("Coach trains players");
    }
}

class Doctor extends TeamMember {

    void heal() {
        System.out.println("Doctor heals players");
    }
}

public class Main10 {

    public static void main(String[] args) {

        Player p = new Player();
        p.play();
    }
}