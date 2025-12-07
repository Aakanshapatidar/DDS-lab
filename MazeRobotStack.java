import java.util.*;

public class MazeRobotStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<String> moves = new Stack<>();

        // 1. Input 5 movements
        for (int i = 0; i < 5; i++) {
            moves.push(sc.next());
        }

        // 2. Show the latest movement
        System.out.println(moves.peek());

        // 3. Undo last two movements
        moves.pop();
        moves.pop();

        // 4. Add corrected movement
        String corrected = sc.next();
        moves.push(corrected);

        // 5. Print final path
        System.out.println(moves);
    }
}
