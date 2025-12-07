//1. ARRAYLIST - Grocery Shopping List Manager
Problem Statement:
A family is organizing a grocery list before going to the supermarket. As they plan, they modify
the list by replacing some items, deleting a few unnecessary ones, and adding new items.
You must simulate this process using an ArrayList.

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListManager {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<String> grocery = new ArrayList<>();

        // 1. Input 5 grocery items
        for (int i = 0; i < 5; i++) {
            grocery.add(sc.next());
        }

        // Additional inputs for replace & add operations
        String newSecondItem = sc.next();  
        String newItemEnd = sc.next();     

        // 2. Print the 1st and 3rd items
        System.out.println(grocery.get(0)); // 1st item
        System.out.println(grocery.get(2)); // 3rd item

        // 3. Replace the 2nd item (index 1)
        grocery.set(1, newSecondItem);

        // 4. Remove the item at index 3 (4th item)
        grocery.remove(3);

        // 5. Add a new item at the end
        grocery.add(newItemEnd);

        // 6. Print the final list
        System.out.println(grocery);
        
        sc.close();
    }
}
