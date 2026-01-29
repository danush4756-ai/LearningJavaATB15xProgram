package OOPS3.Encapsulation;

public class Boolean {
    public static void main(String [] args) {
        bank canara = new bank("darshan", 4000);
        canara.setBalance(5000,false);
        System.out.println(canara.getBalance());
        bank canaraCasher = new bank("Darshan", 6000);
        canaraCasher.setBalance(80000,true);
        System.out.println(canaraCasher.getBalance());
    }
}
class bank {
    public String getAccountHolder() {
        return AccountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.AccountHolder = accountHolder;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance, boolean isCasher) {
        if (isCasher) {
            this.Balance = balance;
        } else {
            System.out.println("only cashier can set the balance");
        }
    }

    private String AccountHolder;
    private int Balance;
    bank (String AccountHolder, int Balance) {
        this.AccountHolder = AccountHolder;
        this.Balance = Balance;
    }
}