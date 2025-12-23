package collections.Homework;

import java.util.*;

public class ArrayListCity {
    public static void main(String[] args) {
        ArrayList<String> cityName = new ArrayList<>();
        cityName.add("Rome");
        cityName.add("Paris");
        cityName.add("London");
        cityName.add("New York");
        cityName.add("Tokyo");

        cityName.add(1, "Yerevan");
        System.out.println(cityName.get(2));
        cityName.set(4, "Dilijan");
        cityName.remove(0);
        System.out.println("The city Tokyo is in the list " + cityName.contains("Tokyo"));
        cityName.sort(Comparator.naturalOrder());
        System.out.println(cityName);


    }
}










/*Create an ArrayList of Strings (city names).
Add 5 cities (e.g., "Rome", "Paris", "London", "New York", "Tokyo").
Insert a city at the second position.
Get and print the third city.
Replace the fourth city with a new city name.
Remove the first city.
Check if a specific city (e.g., "Tokyo") is contained in the list.
Sort the list alphabetically.
Print the final list
 */