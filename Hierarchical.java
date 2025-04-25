class Family { // Parent class
    void sleep() {
        System.out.println("Sleeping");
    }
}

class Man extends Family { // Man child class
    void eat() {
        System.out.println("Eating");
    }
}

class Woman extends Family { // Woman child class
    void talk() {
        System.out.println("Talking");
    }
}

class Child extends Family { // Child class
    void walk() {
        System.out.println("Walking");
    }
}

// Main class
public class Hierarchical {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();
        Child child = new Child();

        man.sleep();  // From Family
        man.eat();

        System.out.println();

        woman.sleep();  // From Family
        woman.talk();

        System.out.println();

        child.sleep(); // From Family
        child.walk();
    }
}