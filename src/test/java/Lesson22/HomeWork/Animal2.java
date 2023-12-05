package Lesson22.HomeWork;

public class Animal2 {
    int eyes;

    Animal2() {
        System.out.println("I am animal");
    }

    public void eat() {
        System.out.println("Animal eats");
    }

    public void drink() {
        System.out.println("Animal drinks");
    }
}

class Pet2 extends Animal2 {
     String name;
     int tail = 1;
     int raw = 4;

    Pet2() {
        System.out.println("I am pet");
        eyes = 2;
    }

    public void run() {
        System.out.println("Pet runs");
    }

    public void jump() {
        System.out.println("Pet jumps");
    }
}

class Dog2 extends Pet2 {
    Dog2(String name) {
        this.name=name;
        System.out.println("I am a dog. My name is " + name);
    }

    public void play() {
        System.out.println("Dog plays");
    }
}

class Cat2 extends Pet2 {
    Cat2(String name) {
        this.name=name;
        System.out.println("I am a cat. My name is " + name);
    }

    public void sleep() {
        System.out.println("Cat sleeps");
    }
}
class Test {
    public static void main(String[] args) {
        Dog2 dog2 = new Dog2("Rick");
        System.out.println("I has " + dog2.raw + " raws");

        Cat2 cat2 = new Cat2("Tom");
        cat2.sleep();
    }
}
