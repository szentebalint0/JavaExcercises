public class Looping {

    public static void main(String[] args) {
        System.out.println(sumDigits(23040));
    }


    public static int sumDigits(int n) {

        int sum = 0;

        if (n < 0) return -1;


        for (int i = 0; i < n; i++) {

            int x = n % 10;
            n = n / 10;
            sum += x;

            if (n < 10) break;
        }

        return sum;


    }
}
