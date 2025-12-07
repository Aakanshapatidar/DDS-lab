//11. HASHMAP - City Population Monitor

import java.util.*;

public class CityPopulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> map = new HashMap<>();

        // 1. Input 5 city-population pairs
        for (int i = 0; i < 5; i++) {
            String city = sc.next();
            int population = sc.nextInt();
            map.put(city, population);
        }

        // 2. Search for a city's population
        String searchCity = sc.next();
        if (map.containsKey(searchCity)) {
            System.out.println("Population of " + searchCity + ": " + map.get(searchCity));
        } else {
            System.out.println(searchCity + " not found");
        }

        // 3. Update a city's population
        String updateCity = sc.next();
        int newPopulation = sc.nextInt();
        map.put(updateCity, newPopulation);
        System.out.println("After update: " + map);

        // 4. Remove a city from record
        String removeCity = sc.next();
        map.remove(removeCity);
        System.out.println("After removing " + removeCity + ": " + map);
    }
}
