public class Main {

    public static void main(String[] args) {

        Bank otp = new Bank("OTP");

        otp.addCustomer("Bálint", 50);
        otp.addCustomer("Bálint", 50);
        otp.addTransaction("Bálint", 100);
        otp.addTransaction("B", 5);
        otp.addTransaction("Bálint", -5);
        otp.printInformation();

    }

}
