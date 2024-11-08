package CreditCard;

public class creditCard {
    private String number;
    private String name;
    private String bank;
    private double balance;
    private int limit;
    public creditCard(String number, String name, String bank, double balance, int limit) {
        this.number = number;
        this.name = name;
        this.bank = bank;
        this.balance = balance;
        this.limit = limit;
    }
    public String getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }
    public String getBank() {
        return bank;
    }
    public double getBalance() {
        return balance;
    }
    public int getLimit() {
        return limit;
    }

    public boolean chargelt(double price){
        if (price + balance > (double) limit)
            return false;
        balance += price;
        return true;
    }
    public void makePayment(double amount){
        balance -= amount;
    }
    public static void printCard(creditCard c){
        System.out.println("Number = " + c.getNumber());
        System.out.println("Name = " + c.getName());
        System.out.println("Bank = " + c.getBank());
        System.out.println("Balance = " + c.getBalance());
        System.out.println("Limit = " + c.getLimit());
    }
}
