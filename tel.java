import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class tel {
    public static void main(String[] args) {
    }

    public static void task1() {
        Map<String, List<String>> map = new HashMap<>();
        Scanner Scanner = new Scanner(System.in);
        List<List<String>> mapValues = new LinkedList<>();
        for (int i = 0; i < 6; i++) {
            System.out.println("Введите имя и номер: ");
            String k = Scanner.next();
            List<String> v = new ArrayList<>();
            v.add(Scanner.next());
            if (map.containsKey(k)) {
                map.get(k).addAll(v);
                mapValues.add(0, map.get(k));
            } else {
                map.put(k, v);
                mapValues.add(map.get(k));
            }
            System.out.println(map);
            Set<List<String>> set = new LinkedHashSet<>(mapValues);
            mapValues.clear();
            mapValues.addAll(set);
            System.out.println(mapValues);
        }
    }
}