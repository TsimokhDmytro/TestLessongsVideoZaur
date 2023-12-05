package Lesson22;


class Human5{

//   private Human5(){
//
//    }

    String name;
    String surname;
}

class Student5 extends Human5{
    Student5(String s){
//        super("Jack");
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        Student5 st5 = new Student5("Jackson");
        System.out.println(st5.surname);
    }
}
