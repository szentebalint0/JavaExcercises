public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setCustomerName("Szente Bálint");
        account.setAccountNumber(1234);
        account.setBalance(500);
        account.setEmail("szente@acer");
        account.setPhoneNumber("+36301345994");

        System.out.println("name = " + account.getCustomerName() +
                " account number = " + account.getAccountNumber() +
                " balance = $" + account.getBalance() +
                " email = " + account.getEmail() +
                " phone number = " + account.getPhoneNumber());

        account.deposit(100);

        account.withdraw(200);

        //account.withdraw(500);

    }

}
