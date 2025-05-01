package coding.fundamental;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class CollectionManipulation {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        // System.out.println(list.add("Sparrow"));
        // System.out.println(list.add("Sparrow"));
        // System.out.println(list.add("Assiri"));

        // System.out.println(list.isEmpty());
        // System.out.println(list.size());

        // Collection<String> set = new HashSet<>();
        // System.out.println(set.add("Sparrow"));
        // System.out.println(set.add("Sparrow"));

        // list.removeIf(s -> s.startsWith("S"));
        // System.out.println(list);
        // list.forEach(s -> System.out.println(s));

        String[] array = new String[] { "a", "b", "c" };
        List<String> asList = Arrays.asList(array);
        List<String> of = List.of(array);
        List<String> copy = List.copyOf(asList);

        array[0] = "z";
        System.out.println(asList);
        System.out.println(of);
        System.out.println(copy);
        asList.set(0, "x");
        System.out.println(Arrays.toString(array));
    }
}
