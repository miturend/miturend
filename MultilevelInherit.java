class College { // College class
    void college() {
        System.out.println("CPAS");
    }
}

class Dept extends College { // Dept class
    void csc() {
        System.out.println("Computer Science");
    }
}

class Student extends College { // Student class
    void student() {
        System.out.println("Student");
    }
}

public class MultilevelInherit {
    public static void main(String[] args) {
        Student demola = new Student();
        demola.college();
        demola.student();
    }
}