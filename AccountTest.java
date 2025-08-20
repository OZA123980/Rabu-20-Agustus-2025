package SavingTest;

public class AccountTest {
    public static void main(String[] args) {

        // Method untuk menghitung saldo setelah bunga
        CheckingAccount sa0001 = new CheckingAccount();
        sa0001.name = "Mika";
        sa0001.interestRate = 0.02;
        sa0001.balance = 1000;
        sa0001.balance = sa0001.calculateInterest();
        sa0001.displayCustomer();

        CheckingAccount sa0002 = new CheckingAccount();
        sa0002.name = "Miki";
        sa0002.interestRate = 0.03;
        sa0002.balance = 2000;
        sa0002.balance = sa0002.calculateInterest();
        sa0002.displayCustomer();

        double totalBalance = sa0001.balance + sa0002.balance;
        System.out.println("Hasil dari saldo " + sa0001.name + " dan " + sa0002.name + " adalah " + totalBalance);
    }
}
 
        