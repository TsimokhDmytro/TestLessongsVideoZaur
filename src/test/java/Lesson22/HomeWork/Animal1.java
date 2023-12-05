package Lesson22.HomeWork;

public class Animal1 {
    int eyes;

    Animal1() {
        System.out.println("I am animal");
    }

    public void eat() {
        System.out.println("Animal eats");
    }

    public void drink() {
        System.out.println("Animal drinks");
    }
}

class Pet1 extends Animal1 {
    private String name;
    private int tail = 1;
    private int raw = 4;
    public void setName(String n){
        this.name=n;
    }

    public int getRaws() {
        return raw;
    }

    Pet1() {
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

class Dog1 extends Pet1 {
    Dog1(String name) {
        setName(name);
        System.out.println("I am a dog. My name is " + name);
    }

    public void play() {
        System.out.println("Dog plays");
    }
}

class Cat1 extends Pet1 {
    Cat1(String name) {
        setName(name);
        System.out.println("I am a cat. My name is " + name);
    }

    public void sleep() {
        System.out.println("Cat sleeps");
    }
}
class Test1 {
    public static void main(String[] args) {
        Dog1 dog1 = new Dog1("Rick");
        System.out.println("I has " + dog1.getRaws() + " raws");

        Cat1 cat1 = new Cat1("Tom");
        cat1.sleep();
    }
}
