//10. LINKEDHASHSET - Wildlife Tracking

import java.util.*;

public class ForestRangers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashSet<String> animals = new LinkedHashSet<>();

        // 1. Input 5 animal names
        for (int i = 0; i < 5; i++) {
            animals.add(sc.next());
        }

        System.out.println("Initial: " + animals);

        // 2. Try adding a duplicate animal
        String duplicate = sc.next();
        boolean added = animals.add(duplicate);
        if (!added) {
            System.out.println("Duplicate ignored");
        }

        // 3. Search for an animal
        String search = sc.next();
        if (animals.contains(search)) {
            System.out.println(search + " found");
        } else {
            System.out.println(search + " not found");
        }

        // 4. Remove an animal
        String removeAnimal = sc.next();
        animals.remove(removeAnimal);
        System.out.println("After removing " + removeAnimal + ": " + animals);
    }
}
