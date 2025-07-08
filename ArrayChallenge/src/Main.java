import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[5];

        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }

        System.out.println(Arrays.toString(array));

        Arrays.sort(array);

        int[] arrayReversed = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            arrayReversed[i] = array[array.length - i - 1];

        }

        System.out.println(Arrays.toString(arrayReversed));

    }

}
