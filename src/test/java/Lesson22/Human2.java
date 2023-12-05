package Lesson22;

public class Human2 {
    final String gen;

    Human2(String gender) {
        this.gen = gender;
    }

    private StringBuilder name;

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
//        return name;
    }

    public void setName(StringBuilder n) {
        name = n;
    }
}

class TestHuman2 {
    public static void main(String[] args) {
        Human2 h2 = new Human2("male");
        h2.setName(new StringBuilder("Jack"));
        h2.getName().append("!!!");
        System.out.println(h2.getName());
    }
}
