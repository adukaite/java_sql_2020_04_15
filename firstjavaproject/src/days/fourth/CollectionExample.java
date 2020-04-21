package days.fourth;

import com.sun.source.tree.Tree;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        listExample();
        setExample();
        mapExample();

        User users = new User( "andrius", "Baltrunas");
        System.out.println(users.getName() + " " + users.getSurname());

    }
    private static void mapExample(){
        Map<Integer, String> cars = new HashMap<>();

        cars.put(1999, "audi");
        cars.put(2000, "bmw");

        cars.keySet().forEach(k -> System.out.println("key" + k + "value" + cars.get(k)));
        System.out.println(cars.size());
        System.out.println(cars.containsValue("bmw"));
    }

    private  static void setExample(){
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(9);
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);

        numbers.forEach(System.out::println);
    }

    private static void listExample(){
        List<String> names = new ArrayList<>();

        names.add("Andrius");
        names.add("Petras");
        names.add("Jonas");
        names.add("Paulius");

        System.out.println(names.size());
        System.out.println(names.get(2));
        names.forEach(System.out::println);
        System.out.println(names.contains("Jonas"));
    }
}
