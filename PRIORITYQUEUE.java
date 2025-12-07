//PRIORITYQUEUE - Hospital Emergency Room

import java.util.*;

public class HospitalTriage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 1. Input 6 severity levels
        for (int i = 0; i < 6; i++) {
            pq.add(sc.nextInt());
        }

        // 2. Show most critical patient
        System.out.println(pq.peek());

        // 3. Treat (poll) two patients
        pq.poll();
        pq.poll();

        // 4. Add new patient severity
        int newSeverity = sc.nextInt();
        pq.add(newSeverity);

        // 5. Show next patient to treat
        System.out.println(pq);
    }
}
