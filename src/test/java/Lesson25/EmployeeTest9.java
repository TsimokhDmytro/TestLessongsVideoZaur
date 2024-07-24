package Lesson25;

public class EmployeeTest9 {

    void abc(){
        System.out.println("Employee sleeps");
    }
}

class DoctorTest9 extends EmployeeTest9{
    void abc(){
        System.out.println("Doctor sleeps");
    }
}
class Test9{
    public static void main(String[] args) {
        EmployeeTest9 e = new EmployeeTest9();
        EmployeeTest9 x1 = new EmployeeTest9();
        EmployeeTest9 x2 = new DoctorTest9();
        DoctorTest9 x3 = new DoctorTest9();


//        DoctorTest9 x4 = new EmployeeTest9();
//        EmployeeTest9 x5 =  (DoctorTest9) new EmployeeTest9();
        DoctorTest9 x6 = (DoctorTest9) new EmployeeTest9();


        e.abc();
        x1.abc();
        x2.abc();
        x3.abc();
//        x4.abc();
//        x5.abc();
//        x6.abc();


    }
}