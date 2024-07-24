package Lesson25.HomeWork.Bug;

public class Lesson25HomeWorkZaurVariant {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        Animal a1 = new Fish("Fish(A)");
        Animal a2 = new Bird("Bird(A)");
        Animal a3 = new Mammal("Mammal(A)");
        Animal a4 = new Swordtail("Swordtail(A)");
        Animal a5 = new Penguin("Penguin(A)");
        Animal a6 = new Lion("Lion(A)");
        Animal a7 = new Animal("Animal(A)");

        Fish f1 = new Fish("Fish(F)");
        Fish f2 = new Swordtail("Swordtail(F)");

        Bird b1 = new Bird("Bird(B)");
        Bird b2 = new Penguin("Penguin(B)");

        Mammal m1 = new Mammal("Mammal(M)");
        Mammal m2 = new Lion("Lion(M)");

        Speakable s1 = new Bird("Bird(S)");
        Speakable s2 = new Mammal("Mammal(S)");
        Speakable s3 = new Lion("Lion(S)");
        Speakable s4 = new Penguin("Penguin(S)");

        Animal arrA[] = {a1, a2, a3, a4, a5, a6, a7, f1, f2, b1, b2, m1, m2};
        System.out.println(ANSI_RED + "Array of the Animal instanceof" + ANSI_RESET);
        for (Animal a : arrA) {
            if (a instanceof Fish) {
                Fish f = (Fish) a;
                System.out.println("\n" + f.name);
                f.eat();
                f.sleep();
                f.swim();

            } else if (a instanceof Bird) {
                Bird b = (Bird) a;
                System.out.println("\n" + b.name);
                b.eat();
                b.sleep();
                b.fly();
                b.speak();

            } else if (a instanceof Mammal) {
                Mammal m = (Mammal) a;
                System.out.println("\n" + m.name);
                m.eat();
                m.sleep();
                m.run();
                m.speak();

            } else if (a instanceof Swordtail) {
                Swordtail s = (Swordtail) a;
                System.out.println("\n" + s.name);
                s.eat();
                s.sleep();
                s.swim();

            } else if (a instanceof Penguin) {
                Penguin p = (Penguin) a;
                System.out.println("\n" + p.name);
                p.eat();
                p.sleep();
                p.fly();
                p.speak();

            } else if (a instanceof Lion) {
                Lion l = (Lion) a;
                System.out.println("\n" + l.name);
                l.eat();
                l.sleep();
                l.run();
                l.speak();

            } else if (a instanceof Animal) {
                System.out.println("\n" + a.name);
                a.eat();
                a.sleep();
            }
        }
        Speakable arrS[] = {s1, s2, s3, s4, b1, b2, m1, m2};
        System.out.println("\n" + ANSI_RED + "Array of the Speakable instanceof" + ANSI_RESET);
        for (Speakable s : arrS) {
            if (s instanceof Bird) {
                Bird b = (Bird) s;
                System.out.println("\n" + b.name);
                b.eat();
                b.sleep();
                b.fly();
                b.speak();

            } else if (s instanceof Mammal) {
                Mammal m = (Mammal) s;
                System.out.println("\n" + m.name);
                m.eat();
                m.sleep();
                m.run();
                m.speak();

            } else if (s instanceof Lion) {
                Lion l = (Lion) s;
                System.out.println("\n" + l.name);
                l.eat();
                l.sleep();
                l.run();
                l.speak();

            } else if (s instanceof Penguin) {
                Penguin p = (Penguin) s;
                System.out.println("\n" + p.name);
                p.eat();
                p.sleep();
                p.fly();
                p.speak();
            }
        }
    }
}


class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " eats");
    }

    public void sleep() {
        System.out.println(name + " sleeps");
    }
}

class Fish extends Animal {

    Fish(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void sleep() {
        System.out.println("Always interesting to look how sleeps a " + name);
    }

    @Override
    public void eat() {
        System.out.println(name + " eats fish food and other fishes");
    }

    public void swim() {
        System.out.println(name + " swims very good");
    }
}

class Bird extends Animal implements Speakable {

    Bird(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + " eats food of different kind");
    }

    @Override
    public void sleep() {
        System.out.println(name + " sleeps on a tree");
    }

    public void fly() {
        System.out.println(name + " flies very well");
    }


    @Override
    public void speak() {
        System.out.println("Always interesting to listen how sings a " + name);
    }
}

class Mammal extends Animal implements Speakable {

    Mammal(String name) {
        super(name);
        this.name = name;
    }

    public void run() {
        System.out.println(name + " can to run");
    }

    @Override
    public void speak() {
        System.out.println(name + " can to speak");
    }
}

interface Speakable {
    default void speak() {
        System.out.println("Someone speaks");
    }
}

class Swordtail extends Fish {

    Swordtail(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + " isn't a predatory fish, it usually eat on fish food");
    }

    @Override
    public void swim() {
        System.out.println(name + " is very beautiful fish which swims very quickly");
    }
}

class Penguin extends Bird {
    Penguin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + " likes to eat fish");
    }

    @Override
    public void sleep() {
        System.out.println(name + " sleep cuddled together on a ice");
    }

    @Override
    public void fly() {
        System.out.println(name + " can't to fly");
    }

    @Override
    public void speak() {
        System.out.println(name + " can't sing like a nightingales");
    }
}

class Lion extends Mammal {
    Lion(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + " likes to eat a meat as any predators");
    }

    @Override
    public void sleep() {
        System.out.println(name + " sleeps more half of the day");
    }

    @Override
    public void run() {
        System.out.println(name + " not faster of the other cats");
    }
}
