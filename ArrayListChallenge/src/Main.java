import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        ArrayList<String> groceryList = new ArrayList<String>();

        while (true){

            System.out.println("""
                    Choose an option below:
                    0 - Shutdown application
                    
                    1 - Add items to the grocery list
                    
                    2 - Remove items from the grocery list
                    
                    3 - Print out your sorted grocery list""");

            switch (scanner.nextLine()) {
                case "0" -> System.exit(0);
                case "1" -> addItems(groceryList);
                case "2" -> removeItems(groceryList);
                case "3" -> {
                    System.out.println("Your sorted list: " + groceryList);
                }
                default -> {
                    System.out.println("Invalid input!");
                   }
            }

        }
    }

    private static void addItems(ArrayList<String> groceryList){
        System.out.println("Please enter the name of the grocery item you want to add, comma delimited: ");
        String[] newItems = scanner.nextLine().split(",");
        for (String item : newItems) {
            if (!groceryList.contains(item)) groceryList.add(item);
        }
        groceryList.sort(Comparator.naturalOrder());

    }

    private static void removeItems(ArrayList<String> groceryList){
        System.out.println("Please enter the name of the grocery item you want to remove, comma delimited: ");
        String[] removeItems = scanner.nextLine().split(",");
        groceryList.removeAll(List.of(removeItems));
    }

}
