import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Place> places = new LinkedList<>();

        places.add(new Place("Syndey", 0));
        places.add(new Place("Adelaide", 1374));
        places.add(new Place("Alice Springs", 2771));
        places.add(new Place("Brisbane", 917));
        places.add(new Place("Darwin", 3972));
        places.add(new Place("Melbourne", 877));
        places.add(new Place("Perth", 3923));

        var iterator = places.listIterator();

        Scanner scanner = new Scanner(System.in);

        boolean flag = true;

        while (flag == true){
            Menu();
        switch (scanner.nextLine().toUpperCase()) {
            case "F" -> {
                while(iterator.hasNext()){
                    System.out.println(iterator.next());
                }
            }
            case "B" -> {
                while (iterator.hasPrevious()){
                    System.out.println(iterator.previous());
                }
            }
            case "L" -> {
                System.out.println(places);
            }

            case "Q" -> {
                flag = false;
            }

            default -> Menu();
        }

        }

    }

    public static void Menu(){
        System.out.println("""
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""");
    }
}
