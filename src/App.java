import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> duplicates = new ArrayList<>();
        String[] animals_one = new String[] { "Goat", "Whale", "Horse", "Goose" };
        String[] animals_two = new String[] { "Turtle", "Cat", "Whale", "Bird" };

        for (int i = 0; i < animals_one.length; i++) {
            for (int j = 0; j < animals_two.length; j++) {
                if (animals_one[i].equals(animals_two[j])) {
                    duplicates.add(animals_one[i]);
                }
            }
        }
        for (int i = 0; i < duplicates.size(); i++) {
            System.out.println(duplicates.get(i));
        }
    }
}
