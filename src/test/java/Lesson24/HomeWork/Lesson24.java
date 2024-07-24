package Lesson24.HomeWork;

public class Lesson24 {
    public static void main(String[] args) {
        Swordtail sw = new Swordtail("swordtail");
        System.out.println(sw.name);
        sw.eat();
        sw.swim();
        sw.sleep();
        System.out.println();

        Speakable sp = new Penguin("penguin");
        sp.speak();
        System.out.println();

        Animal an = new Lion("Lion1");
        an.eat();
        an.sleep();
        System.out.println();

        Mammal mam = new Lion("Lion2");
        mam.eat();
        mam.sleep();
        mam.run();
        mam.speak();
    }
}

abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    public abstract void eat();

    public abstract void sleep();
}

abstract class Fish extends Animal {

    Fish(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void sleep() {
        System.out.println("Always interesting to look how sleep fishes");
    }

    public abstract void swim();
}

abstract class Bird extends Animal implements Speakable {

    Bird(String name) {
        super(name);
        this.name = name;
    }

    public abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + " sings");
    }
}

abstract class Mammal extends Animal implements Speakable {

    Mammal(String name) {
        super(name);
        this.name = name;
    }

    public abstract void run();
}

interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }
}

class Swordtail extends Fish {
    String name;

    Swordtail(String name) {
        super(name);
        this.name = name;
    }

    public void swim() {
        System.out.println("The swordtail very beautiful fish which quickly swim");
    }

    public void eat() {
        System.out.println("The swordtail is not a predatory fish, it usually eat on fish food");
    }
}

class Penguin extends Bird {
    Penguin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Penguin likes to eat fish");
    }

    @Override
    public void sleep() {
        System.out.println("Penguins sleep cuddled together");
    }

    @Override
    public void fly() {
        System.out.println("Penguin can't to fly");
    }

    @Override
    public void speak() {
        System.out.println("Penguin can't sing like a nightingales");
    }
}

class Lion extends Mammal {
    Lion(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("The lion likes to eat a meat as any predators");
    }

    @Override
    public void sleep() {
        System.out.println("The lion sleeps more half of the day");
    }

    @Override
    public void run() {
        System.out.println("The lion not faster of the other cats");
    }
}