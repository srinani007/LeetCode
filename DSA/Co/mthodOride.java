package Co;

public class mthodOride {
    class ATM {
        void withdraw(int amount) { System.out.println("Withdraw $" + amount + " using PIN"); }
        void withdraw(int amount, String biometric) { System.out.println("Withdraw $" + amount + " using Biometric"); }
    }
    class Bank {
        double getInterestRate() { return 5.0; }  // Default rate
    }
    class SBI extends Bank {
        double getInterestRate() { return 6.5; }  // Overridden method
    }
    
    public static void main(String[] args) {
        mthodOride outer = new mthodOride();
        ATM atm = outer.new ATM();
        atm.withdraw(100);
        atm.withdraw(100, "prasanth");
        Bank bank = outer.new SBI();
        System.out.println("Bank Interest Rate: " + bank.getInterestRate());
        
    }

}
