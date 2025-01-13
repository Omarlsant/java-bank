public class Main {
    public static void main(String[] args) {
        // basic variables
        String accountNumber = "123456789";
        double balance = 1500.75;
        int pin = 1234;

        // array - amount of transactions
        int[] transactionsAmounts = {200, -100, 50};

        // Operations with variables
        balance += transactionsAmounts[0];
        if (balance > 0 && pin == 1234) {
            System.out.println("Access granted!");
        }

        // Use of operators
        balance++;
        String status = (balance < 0) ? "Debt" : "Credit";
        System.out.println("You have: $" + status);
    }
}