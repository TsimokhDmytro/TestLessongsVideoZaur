package Lesson22;
class Test6{

}
 class Human6 {


    Human6(String n, String s) {
        this.name = n;
        this.surname = s;
    }

    String name;
    String surname;
}

class Student6 extends Human6 {
    int course;

    Student6(String n, String s, int c) {
        super(n, s);
        this.course = c;
    }

    public static void main(String[] args) {
        Student6 st6 = new Student6("Jack", "Jackson", 4);
        System.out.println(st6.name);
        System.out.println(st6.surname);
        System.out.println(st6.course);
    }
}