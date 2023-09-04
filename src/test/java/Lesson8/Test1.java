package Lesson8;

public class Test1 {
    private  int sad;

    public Test1(int sad) {
        this.sad = sad;
    }

    @Override
    public String toString() {
        return "Test1{" +
                "sad=" + sad +
                '}';
    }

    public int getSad() {
        return sad;
    }

    public void setSad(int sad) {
        this.sad = sad;
    }
}
