package Lesson22;

public class Human {
    final String gen;

    Human(String gender) {
        this.gen = gender;
    }

    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

    private int age;
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        if (a>0){
            age = a;
        }
    }

    private double weight;
    public double getWeight(){
        return weight;
    }
    public void setWeight(double w){
        if (w>=45 && w<=160){
            weight = w;
        }
    }

    private boolean clever;
    public boolean isClever(){
        return clever;
    }

    public void setClever(boolean b){
        clever = b;
    }
}

class TestHuman {
    public static void main(String[] args) {
        Human h1 = new Human("male");
        h1.setName("John");
        h1.setAge(35);
        h1.setAge(-333335);
        h1.setWeight(72.4);
        h1.setWeight(-72.4);
        System.out.println(h1.getName());
        System.out.println(h1.getAge());
        System.out.println(h1.getWeight());
    }
}

