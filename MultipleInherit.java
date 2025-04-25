interface Human { // Interface 1
    void live();
}

interface Student { // Interface 2
    void read();
}

class Freshman implements Human, Student {
    public void live() {
        System.out.println("Live");
    }

    public void read() {
        System.out.println("Read");
    }

    void play() {
        System.out.println("Play");
    }
}

public class MultipleInherit {
    public static void main(String[] args) {
        Freshman cpas = new Freshman();
        cpas.live();
        cpas.read();
        cpas.play();
    }
}