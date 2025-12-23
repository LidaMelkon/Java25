package collections.Homework;

import java.awt.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapCountry {
    public static void main(String[] args) {
        LinkedHashMap<String, String> countryMap = new LinkedHashMap<>();
        countryMap.put("Italy", "Rome");
        countryMap.put("France", "Paris");
        countryMap.put("Japan", "Tokyo");
        countryMap.put("Germany", "Berlin");
        countryMap.put("USA", "Washington");


        System.out.println("" + countryMap);
        countryMap.put("Germany", "Munich");
        countryMap.remove("France");
        System.out.println("Specific country Spain exists " + countryMap.containsKey("Spain"));
        System.out.println("Specific capital Tokyo exists " + countryMap.containsValue("Tokyo"));
        System.out.println(countryMap.get("Japan"));
        System.out.println("Print the size of the map" + countryMap.size());

        Set<Map.Entry<String, String>> entries = countryMap.entrySet();
        System.out.println("Entries " + entries);
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " :" + entry.getValue());
        }

        for (String country : countryMap.keySet()) {
            System.out.print("Country " + country + ", ");

        }
        System.out.println();

        for (String capital : countryMap.values()) {
            System.out.print("Capital " + capital + ", ");
        }
        countryMap.clear();
        System.out.println();
        System.out.println("Is the map empty " + countryMap.isEmpty());


    }


}



/*
Add entries like: "Italy" → "Rome", "France" → "Paris", "Japan" → "Tokyo", "USA" → "Washington".
Print all countries and capitals in insertion order.
Replace the capital of "Germany" with "Munich".
Remove the country "France" from the map.
Check if a specific country exists (e.g., "Spain").
Check if a specific capital exists (e.g., "Tokyo").
Get the capital of "Japan" and print it.
Print the size of the map.
Iterate over the map and print each Country:Capital pair.
Print all country names separately using keySet().
Print all capital names separately using values().
Clear the map completely.
Check if the map is empty.
 */