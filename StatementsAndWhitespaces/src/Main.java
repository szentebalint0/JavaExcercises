public class Main {
    public static void main(String[] args) {
        int myVariable = 50;

        myVariable++;
        myVariable--;

        System.out.println("This is a test");

        System.out.println("This is" +
                "another test");

        int anotherVariable = 50;
        myVariable--;
        System.out.println(anotherVariable);

        if (myVariable == 0) {
        System.out.println("Its now zero");
        }
    }
}
