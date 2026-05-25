public class BankAccount {

    private String accountHolder;
    private double balance;
    private double minBalance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    public BankAccount(String accountHolder, double balance, double minBalance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.minBalance = minBalance;
    }

    // TODO 1: Deposit
    // Add amount only if amount > 0
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Enter valid amount");
        }
    }

    // TODO 2: Withdraw
    // Only allow if:
    // balance - amount >= minBalance
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= minBalance) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal not allowed");
        }
    }

    // TODO 3: Transfer
    // Transfer money to another account
    // (use withdraw + deposit)
    public void transfer(BankAccount target, double amount) {
        if (amount > 0 && (balance - amount) >= minBalance) {
            this.withdraw(amount);
            target.deposit(amount);
            System.out.println("amount deposited");
        } else {
            System.out.println("Transfer not allowed");
        }
    }

    // TODO 4: Apply Interest
    // Add (balance * rate / 100) to balance
    public void applyInterest(double rate) {
        if (rate > 0)
            balance += (balance * rate / 100);
    }

    // TODO 5: Account Summary
    public String getSummary() {
        return getAccountHolder() + " Balance in Account: " + getBalance();
    }

    public static void main(String[] args) {
        BankAccount a = new BankAccount("A", 1000, 200);
        BankAccount b = new BankAccount("B", 500, 100);

        a.transfer(b, 700); // should PASS
        a.transfer(b, 900); // should FAIL
    }
}