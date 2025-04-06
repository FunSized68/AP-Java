package random;
import java.util.ArrayList;

public class Part0 {
    public static String findShortestString(ArrayList<String> list) {

        if (list == null || list.isEmpty()) {
            return null;
        }


        String shortest = list.get(0);


        for (String current : list) {
            if (current.length() < shortest.length()) {
                shortest = current;
            }
        }

        return shortest;
    }

    public static void main(String[] args) {

        ArrayList<String> test1 = new ArrayList<>();
        test1.add("apple");
        test1.add("be");
        test1.add("cat");
        test1.add("doggy");
        System.out.println("Test 1 - Expected 'be': " + findShortestString(test1));


        ArrayList<String> test2 = new ArrayList<>();
        test2.add("hello");
        System.out.println("Test 2 - Expected 'hello': " + findShortestString(test2));


        ArrayList<String> test3 = new ArrayList<>();
        test3.add("cat");
        test3.add("dog");
        test3.add("rat");
        System.out.println("Test 3 - Expected 'cat': " + findShortestString(test3));


        ArrayList<String> test4 = new ArrayList<>();
        test4.add("hello");
        test4.add("");
        test4.add("world");
        System.out.println("Test 4 - Expected '': " + findShortestString(test4));


        ArrayList<String> test5 = new ArrayList<>();
        System.out.println("Test 5 - Expected null: " + findShortestString(test5));
    }
}
