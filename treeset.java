//9. TREESET - Marathon Ranking System

import java.util.*;

public class MarathonTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeSet<Integer> times = new TreeSet<>();

        // 1. Input 7 timings
        for (int i = 0; i < 7; i++) {
            times.add(sc.nextInt());
        }

        // 2. Show best (smallest) and worst (largest) time
        System.out.println("Best: " + times.first());
        System.out.println("Worst: " + times.last());

        // 3. Remove a given time
        int removeTime = sc.nextInt();
        times.remove(removeTime);
        System.out.println("After removing " + removeTime + ": " + times);

        // 4. Show time just above 300
        System.out.println("Above 300: " + times.higher(300));

        // 5. Print sorted list
        System.out.println("Sorted List: " + times);
    }
}
