package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTester {
    public static void main(String[] args) {
        Map<String,String> stringMap = new HashMap<>();
        stringMap.put("name","lida");
        stringMap.put("age","30");
        stringMap.put("city","Yerevan");
        stringMap.put("age","31");
        stringMap.put("country", null);
        //print keys
        Set<String> keys = stringMap.keySet();
        System.out.println(keys);
        //print values
        Collection<String> values = stringMap.values();
        System.out.println(values);
        //size
        System.out.println(stringMap.size());
        //key-ov value get anel
        System.out.println(stringMap.get("city"));
        //print deleted entry
        String nullValue =  stringMap.remove(null);
        System.out.println("this is removed " + nullValue);
        //contains key, value
        boolean containKey = stringMap.containsValue("lida");
        System.out.println("Conatins value 'lida'" + containKey);
        System.out.println("Check the map is empty " + stringMap.isEmpty());
        //kanuma  entries
        Set<Map.Entry<String,String>> entries =  stringMap.entrySet();
        System.out.println("Entries " + entries);
        for(Map.Entry<String,String> entry : entries){
            System.out.println(entry.getValue());
            System.out.println(entry.getKey() + " :" + entry.getValue());
        }
    }
}
