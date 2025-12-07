//3. VECTOR - Museum Exhibit Arrangement

import java.util.*;

public class MuseumVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vector<Integer> exhibits = new Vector<>();

        // 1. Input 5 exhibit IDs
        for (int i = 0; i < 5; i++) {
            exhibits.add(sc.nextInt());
        }

        // 2. Print the 1st and 4th exhibit
        System.out.println(exhibits.get(0));  // 1st
        System.out.println(exhibits.get(2));  // 3rd index = 4th element

        // 3. Insert rare artifact at index 2
        int rare = sc.nextInt();
        exhibits.add(2, rare);

        // 4. Remove last exhibit
        exhibits.remove(exhibits.size() - 1);

        // 5. Replace exhibit at index 3
        int replaceValue = sc.nextInt();
        exhibits.set(3, replaceValue);

        // Final Output
        System.out.println(exhibits);
    }
}
