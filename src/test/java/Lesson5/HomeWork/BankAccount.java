package Lesson5.HomeWork;

public class BankAccount {

    int id = 125;
    String name = "Petro";
    double balance = 456.85;

    public void popolnenieScheta(double sumaPopolneniya) {
        System.out.println("Name account: " + name + "\n" + "id account: " + id + "\n" + "balance do popolneniya = " + balance);
        System.out.println("summa popolneniya = " + sumaPopolneniya);
        balance += sumaPopolneniya;
        System.out.println("balance posle popolneniya = " + balance);
        System.out.println();
    }

    public void sniatieScheta(double sumaSniatiya) {
        System.out.println("Name account: " + name + "\n" + "id account: " + id +"\n" + "balance do sniyatia = " + balance);
        System.out.println("summa sniatiya = " + sumaSniatiya);
        balance -= sumaSniatiya;
        System.out.println("balance posle sniatiya = " + balance);
    }

    static class BankAccount2Test {
        public static void main(String[] args) {
            BankAccount myAccount = new BankAccount();
            myAccount.popolnenieScheta(645.25);
            myAccount.sniatieScheta(3506.25);
        }
    }
}



