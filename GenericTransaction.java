public class Transaction<T extends Account> {
    private T account;
    private TransactionType transactionType;

    public Transaction(T account, TransactionType transactionType) {
        this.account = account;
        this.transactionType = transactionType;
    }

    public void performOperation(double amount) {
        // Perform the main operation within the transaction based on the transaction type
        if (transactionType == TransactionType.DEPOSIT) {
            account.deposit(amount);
        } else if (transactionType == TransactionType.WITHDRAW) {
            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).withdraw(amount);
            } else if (account instanceof CurrentAccount) {
                ((CurrentAccount) account).withdraw(amount);
            }
        }
    }

    public static void main(String[] args) {
        // Create a transaction to deposit into a specific account
        Transaction<SavingsAccount> depositTransaction = new Transaction<>(new SavingsAccount("John", 1000),
                TransactionType.DEPOSIT);

        // Perform deposit operation within the transaction
        depositTransaction.performOperation(500);

        // Create a transaction to withdraw from a specific account
        Transaction<CurrentAccount> withdrawTransaction = new Transaction<>(new CurrentAccount("Alice", 2000),
                TransactionType.WITHDRAW);

        // Perform withdrawal operation within the transaction
        withdrawTransaction.performOperation(1000);
    }
}

enum TransactionType {
    DEPOSIT,
    WITHDRAW
}

abstract class Account {
    private String owner;
    private double balance;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current balance: " + balance);
    }

    public abstract void withdraw(double amount);
    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String owner, double balance) {
        super(owner, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn from Savings Account: " + amount);
            System.out.println("Current balance: " + getBalance());
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(String owner, double balance) {
        super(owner, balance);
    }

    @Override
    public void withdraw(double amount) {
        double availableBalance = getBalance() - 100; // Consider a minimum balance of 100 for current accounts
        if (availableBalance >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn from Current Account: " + amount);
            System.out.println("Current balance: " + getBalance());
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
