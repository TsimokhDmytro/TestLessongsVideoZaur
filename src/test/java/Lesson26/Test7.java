package Lesson26;

public class Test7 {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        Mammal mammal = new Mammal();
        Lion lion = new Lion();
//        Lion lion2 = new Lion();


    }
}

class Animal {
    Animal() {
        System.out.println("This is constructor of animal");
    }

    static {
        System.out.println("This is static initializer block of animal");
    }

    {
        System.out.println("This is non-static initializer block of animal");
    }
}

class Mammal extends Animal {
    Mammal() {
        System.out.println("This is constructor of mammal");
    }

    static {
        System.out.println("This is static initializer block of mammal");
    }

    {
        System.out.println("This is non-static initializer block of mammal");
    }
}

class Lion extends Mammal {
    Lion() {
        System.out.println("This is constructor of lion");
    }

    static {
        System.out.println("This is static initializer block of lion");
    }

    {
        System.out.println("This is non-static initializer block of lion");
    }
}

