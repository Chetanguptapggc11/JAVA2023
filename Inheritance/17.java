abstract class BankAccount {
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    
    void deposit(double amount) {
        // Implement deposit logic for savings account
    }

    
    void withdraw(double amount) {
        // Implement withdrawal logic for savings account
    }
}

class CurrentAccount extends BankAccount {
    
    void deposit(double amount) {
        // Implement deposit logic for current account
    }

    
    void withdraw(double amount) {
        // Implement withdrawal logic for current account
    }
}

