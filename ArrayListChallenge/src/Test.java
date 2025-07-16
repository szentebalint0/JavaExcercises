import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {

        ArrayList<String> testList = new ArrayList<String>();

        testList.add("A");
        testList.add("B");
        testList.add("C");

        Iterator<String> iterator = testList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("A")) {iterator.remove(); }
        }

        System.out.println(testList);

    }
}
