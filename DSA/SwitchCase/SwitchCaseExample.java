package SwitchCase;

public class SwitchCaseExample {

    public class Candy {

        String name;
        int price;

        // Correct constructor initialization
        public Candy(String name, int price) {
            this.name = name;
            this.price = price;
        }

        // Override toString() method to provide a meaningful output
        @Override
        public String toString() {
            return "Candy{name='" + name + "', price=" + price + "}";
        }

        // Method to get a Candy based on money
        public Candy getCandy(int money) {
            Candy candy = null;
            switch (money) {
                case 1:
                    candy = new Candy("Choco Chip", 1000);
                    break;
                case 2:
                    candy = new Candy("Honey Butter Chip", 1000);
                    break;
                default:
                    candy = new Candy("Unknown", 0);
                    break;
            }
            return candy;
        }
    }

    public static void main(String[] args) {
        // Create an instance of the outer class
        SwitchCaseExample example = new SwitchCaseExample();
        // Create an instance of the inner Candy class
        Candy candy = example.new Candy("Sample", 0);

        // Get candy based on money
        Candy selectedCandy = candy.getCandy(2);
        // Print the selected candy
        System.out.println(selectedCandy);
    }
}
