import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("один", "два", "два", "один", "ноль", "три", "четыре", "ноль"));
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        task1(nums);
        task2(nums);
        task3(words);
        task4(strings);

    }

    private static void task1(List<Integer> list) {
        System.out.println("Задание 1");
        for (Integer num : list) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private static void task2(List<Integer> list) {
        System.out.println("Задание 2");
        Set<Integer> set = new TreeSet<>(list);
        for (Integer num : set) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private static void task3(List<String> words) {
        System.out.println("Задание 3");
        Set<String> selection = new HashSet<>(words);
        for (String word : selection) {
            System.out.print(word + " ");
        }
        System.out.println();
    }

    private static void task4(List<String> strings) {
        System.out.println("Задание 4");
        Set<String> set2 = new HashSet<>(strings);
        for (String string : set2) {
            System.out.println(Collections.frequency(strings, string));
        }
    }
}
