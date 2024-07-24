package Lesson25.HomeWork;

public class Lesson25 {
    public static void main(String[] args) {
//        Swordtail sw = new Swordtail("swordtail");
//        System.out.println(sw.name);
//        sw.eat();
//        sw.swim();
//        sw.sleep();
//        System.out.println();
//
//        Speakable sp = new Penguin("penguin");
//        sp.speak();
//        System.out.println();
//
//        Animal an = new Lion("Lion1");
//        an.eat();
//        an.sleep();
//        System.out.println();
//
//        Mammal mam = new Lion("Lion2");
//        mam.eat();
//        mam.sleep();
//        mam.run();
//        mam.speak();

        Fish fish = new Fish("fish");
        Bird bird = new Bird("bird");
        Mammal mammal = new Mammal("mammal");


        Speakable arr1[] = {bird, mammal};
        System.out.println("Array of the Speakable instanceof");
        for (int i = 0; i < arr1.length-1; i++) {
            if (arr1[i] instanceof Speakable){
//                System.out.println(arr1[i].name);
                arr1[i].speak();
//                arr1[i].;
            }
        }

        Animal arr2[] = {fish, bird, mammal};
        System.out.println("\n" + "\n" + "Array of the Animal instanceof");
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] instanceof Animal){
                System.out.println(arr2[i].name);
                arr2[i].eat();
                arr2[i].sleep();
            }
        }


    }
}

 class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("someone eats");
    }

    public void sleep(){
        System.out.println("someone sleeps");
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

    public void swim(){
        System.out.println(name +  " swims");
    }
}

 class Bird extends Animal implements Speakable {
//    String name;
    Bird(String name) {
        super(name);
        this.name = name;
    }

    public void fly(){
        System.out.println(name + " flys");
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

    public void run(){
        System.out.println(name + " runs");
    }
}

interface Speakable {
    default void speak() {
        System.out.println("Someone speaks");
    }
}

class Swordtail extends Fish {
//    String name;

    Swordtail(String name) {
        super(name);
        this.name = name;
    }

    public void swim() {
        System.out.println("The " + name + " swordtail very beautiful fish which quickly swim");
    }

    public void eat() {
        System.out.println("The " + name + " swordtail is not a predatory fish, it usually eat on fish food");
    }
}

class Penguin extends Bird {
    Penguin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("The " + name + " likes to eat fish");
    }

    @Override
    public void sleep() {
        System.out.println("The " + name + " sleep cuddled together");
    }

    @Override
    public void fly() {
        System.out.println("The " + name + " can't to fly");
    }

    @Override
    public void speak() {
        System.out.println("The " + name + " can't sing like a nightingales");
    }
}

class Lion extends Mammal {
    Lion(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("The " + name + " likes to eat a meat as any predators");
    }

    @Override
    public void sleep() {
        System.out.println("The " + name + " sleeps more half of the day");
    }

    @Override
    public void run() {
        System.out.println("The " + name + " not faster of the other cats");
    }
}