public class Main {
    public static void main(String[] args) {


    calculateInterest(100);

    }

    public static void calculateInterest(int money){



        for(double i =7.5; i <= 10; i += 0.25){

            System.out.println(money * i * 0.01);
        }

    }
}
