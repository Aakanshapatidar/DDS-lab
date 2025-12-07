//13. LINKEDHASHMAP - Attendance Register

import java.util.*;

public class AttendanceList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<Integer, String> attendance = new LinkedHashMap<>();

        // 1. Input 5 roll-number/name pairs
        for (int i = 0; i < 5; i++) {
            int roll = sc.nextInt();
            String name = sc.next();
            attendance.put(roll, name);
        }

        // 2. Update a student's name
        int updateRoll = sc.nextInt();
        String newName = sc.next();
        attendance.replace(updateRoll, newName);
        System.out.println("After update: " + attendance);

        // 3. Check if a roll exists
        int checkRoll = sc.nextInt();
        if (attendance.containsKey(checkRoll)) {
            System.out.println("Roll " + checkRoll + " exists");
        } else {
            System.out.println("Roll " + checkRoll + " not found");
        }

        // 4. Remove a roll entry
        int removeRoll = sc.nextInt();
        attendance.remove(removeRoll);

        // 5. Print updated attendance list
        System.out.println(attendance);
    }
}
