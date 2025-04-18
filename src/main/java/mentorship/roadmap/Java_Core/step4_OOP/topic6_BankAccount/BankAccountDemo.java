package mentorship.roadmap.Java_Core.step4_OOP.topic6_BankAccount;

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount("12793", 1000.10);

        acc.deposit(500);
        acc.withdraw(600.50);
        System.out.println("Актуальный баланс: " + acc.getBalance());
    }
}
