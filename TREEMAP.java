//12. TREEMAP - Mini Dictionary

import java.util.*;

public class DictionaryTreeMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeMap<String, String> dict = new TreeMap<>();

        // 1. Input 5 word-meaning pairs
        for (int i = 0; i < 5; i++) {
            String word = sc.next();
            String meaning = sc.next();
            dict.put(word, meaning);
        }

        // 2. Search a word's meaning
        String searchWord = sc.next();
        System.out.println("Meaning of " + searchWord + ": " + dict.get(searchWord));

        // 3. Update meaning of a word
        String updateWord = sc.next(); 
        String newMeaning = sc.next();
        dict.put(updateWord, newMeaning);
        System.out.println("After update: " + dict);

        // 4. Remove a word
        String removeWord = sc.next();
        dict.remove(removeWord);
        System.out.println("After removing " + removeWord + ": " + dict);
    }
}
