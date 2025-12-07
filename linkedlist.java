//2. LINKEDLIST - Train Bogie Manager
//Problem Statement:
//Indian Railways wants to reorganize the bogies of a train before departure. Since bogies are
//frequently added or removed from ends, LinkedList is used.

import java.util.*;

public class TrainBogies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<String> train = new LinkedList<>();

        // 1. Input 5 bogie names
        for (int i = 0; i < 5; i++) {
            train.add(sc.next());
        }

        // 2. Print first and last bogies
        System.out.println(train.getFirst());
        System.out.println(train.getLast());

        // 3. Add Engine at front and Guard Coach at end
        train.addFirst("Engine");
        train.addLast("Guard Coach");

        // 4. Remove bogie at a given index
        int removeIndex = sc.nextInt();
        train.remove(removeIndex);  

        // 5. Replace bogie at index 4
        String newBogie = sc.next();
        train.set(4, newBogie);

        // Final Output
        System.out.println(train);
    }
}
