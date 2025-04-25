class Dept { // Parent class (Dept) 
    void write() {
        System.out.println("Writing");
    }
}

class Student extends Dept { // Child class (Student)
    void jott() {
        System.out.println("Jotting");
    }
}

// Main class
public class SingleInherit {
    public static void main(String[] args) {
        Student demola = new Student();
        demola.write();
        demola.jott();
    }
}