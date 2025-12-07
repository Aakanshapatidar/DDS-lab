//8. HASHSET - Secret Code Registry

import java.util.*;

public class SecretCodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> codes = new HashSet<>();

        // 1. Input 7 codes (duplicates ignored automatically)
        for (int i = 0; i < 7; i++) {
            codes.add(sc.nextInt());
        }

        // 2. Search for a code
        int search = sc.nextInt();
        if (codes.contains(search)) {
            System.out.println(search + " found");
        } else {
            System.out.println(search + " not found");
        }

        // 3. Remove a code
        int toRemove = sc.nextInt();
        codes.remove(toRemove);
        System.out.println("After removing " + toRemove + ": " + codes);

        // 4. Try adding a duplicate code
        int dup = sc.nextInt();
        codes.add(dup); // HashSet will ignore if duplicate

        // 5. Print final unique set
        System.out.println("Unique Set: " + codes);
    }
}
