package CreditCard;

public class Test {
    public static void main(String[] args) {
        creditCard wallet[] = new creditCard[10];
        wallet[0] = new creditCard("534 6727 72832", "prasanth", "chase", 350.0, 3000);
        wallet[1] = new creditCard("534 6727 72832", "prasanth", "chase", 350.0, 3000);
        wallet[2] = new creditCard("534 6727 72832", "prasanth", "chase", 350.0, 3000);

        for (int i = 0; i < 3; i++) {
            wallet[0].chargelt((double)i);
            wallet[1].chargelt(2.0 * i);
            wallet[2].chargelt((double)3 * i);
        }
        System.out.println("Card Payments: ");
        for (int i = 0; i < 3; i++) {
           creditCard.printCard(wallet[i]);
           while (wallet[i].getBalance()>100.0) {
            wallet[i].makePayment(100.0);
            System.out.println("New balance = " + wallet[i].getBalance());
           }
           System.out.println();
        }
    }

}
