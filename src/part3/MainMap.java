package part3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainMap {

    public static void main(String[] args) {
        // Mapa - zbiór klucz + wartość

        Map<Integer, String> users = new HashMap<>();

        users.put(1,"Marek");
        users.put(10,"Stefan");
        users.put(5,"Bobo");
        users.put(15,"Olga");
        users.put(12,"Izabela");
        users.put(9,"Lukasz");

        System.out.println(users);

        for (Map.Entry<Integer, String> entry : users.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

    }
}
