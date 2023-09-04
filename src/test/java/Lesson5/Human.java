package Lesson5;

public class Human {
    String name;
    Car3 car;
    BankAccount bA;
    void showInfo(){
        System.out.println("Name: "+name+"\n"+ "Color car: "+car.color+"\n"+"Balance: "+ bA.balance);
    }
}

class HumanTest{
    public static void main(String[] args) {
        Human h = new Human();
        h.name="David";
        h.car=new Car3("black","V12");
        h.bA=new BankAccount(15,3564);
        h.showInfo();
    }
}

class Car3{
    Car3 (String cvet, String motor){
        color = cvet;
        engine = motor;
    }
    String color;
    String engine;
}
class BankAccount{
    BankAccount (int id2, double balance2){
        id = id2;
        balance = balance2;
    }
    int id;
    double balance;
}

