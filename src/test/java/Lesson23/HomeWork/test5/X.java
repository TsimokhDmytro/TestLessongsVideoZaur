package Lesson23.HomeWork.test5;

  class X {
    String s = "pryvit";
      boolean bool = true;
      public void abc(){
          System.out.println("www");
      }
}
class Y extends X{
      public void abc(){
          System.out.println("qqq");
      }
     boolean bool = false;
}
 class Test extends Y{
    public static void main(String args[]) {
        X x = new Y();
//        Y y = new Y();
        x.abc();
        System.out.println(x.s + " " + x.bool);
    }
}
