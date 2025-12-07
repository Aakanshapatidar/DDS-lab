//. QUEUE - Roller-Coaster Waiting Line

import java.util.*;

public class RollerCoasterQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<String> q = new LinkedList<>();

        // 1. Input 5 visitor names
        for (int i = 0; i < 5; i++) {
            q.offer(sc.next());
        }

        // 2. Show first visitor
        System.out.println(q.peek());

        // 3. Remove (serve) two visitors
        q.poll();
        q.poll();

        // 4. Add a new visitor
        String newVisitor = sc.next();
        q.offer(newVisitor);

        // 5. Show next visitors
        System.out.println(q);
    }
}
