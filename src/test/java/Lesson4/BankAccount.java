package Lesson4;

public class BankAccount {

    int id;
    String name;
    float balance;
    float percentPlus;
    float percentMinus;
    float summaReplenishment;
    float balanceAfterReplenishment;
    float summaWithdrawal;
    float balanceAfterWithdrawal;

    public void showInfoAccount() {
        System.out.println("\n" + "Name account: " + name + "\n" + "Id account: " + id + "\n" + "Balance account: " + balance);
    }

    public void doOperations(float percent1, float percent2) {
        float percentPlus = percent1;
        System.out.println("Percent replenishment: " + percentPlus + "%");
        summaReplenishment = balance * percentPlus;
        System.out.println(String.format("Summa Replenishment: " + "%.1f", +summaReplenishment));
        balanceAfterReplenishment = balance + summaReplenishment;
        System.out.println(String.format("Balance After replenishment: " + "%.1f", balanceAfterReplenishment));
        float percentMinus = percent2;
        System.out.println("Percent withdrawal: " + percentMinus + "%");
        summaWithdrawal = balanceAfterReplenishment * percentMinus;
        System.out.println(String.format("Summa withdrawal: " + "%.1f", +summaWithdrawal));
        balanceAfterWithdrawal = balanceAfterReplenishment - summaWithdrawal;
        System.out.println(String.format("Balance After Withdrawal: " + "%.1f", balanceAfterWithdrawal));
    }

    static class BankAccountTest {
        public static void main(String[] args) {
            BankAccount myAccount = new BankAccount();
            myAccount.id = 256;
            myAccount.name = "Dmytro";
            myAccount.balance = 122564.6565f;
            myAccount.showInfoAccount();
            myAccount.doOperations(0.15f, 0.63f);

            BankAccount hisAccount = new BankAccount();
            hisAccount.id = 551;
            hisAccount.name = "Jack";
            hisAccount.balance = 46538.6555f;
            hisAccount.showInfoAccount();
            hisAccount.doOperations(0.35f, 0.15f);

            BankAccount herAccount = new BankAccount();
            herAccount.id = 224;
            herAccount.name = "Lesia";
            herAccount.balance = 95235.343f;
            herAccount.showInfoAccount();
            herAccount.doOperations(0.43f, 0.24f);
        }
    }
}




