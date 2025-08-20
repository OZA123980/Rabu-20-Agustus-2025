package SavingTest;

public class CheckingAccount {
    public double balance;
    public double interestRate;
    public String name;
    
     public void displayCustomer() {
        System.out.println("Customer Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Interest Earned: " + (balance * interestRate));
        System.out.println("-----------------------------");
        System.out.println("Total Balance after interest: " + (balance + (balance * interestRate)));
        System.out.println("-----------------------------");    
        System.out.println("Terimakasih telah menggunakan layanan kami");
    }

    // Method untuk menampilkan data cutomer
    public double calculateInterest() {
        double interest = balance * interestRate / 12;
        return interest;
    }
}

    

