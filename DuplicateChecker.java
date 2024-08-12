package Tasks81224;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChecker {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 3, 4, 5};
        int counter = 0;
        int currentValue = numbers[0];

        Map<Integer, Integer> numberMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numberMap.containsKey(numbers[i])) {
                System.out.println("Duplicate item found");
                return;
            }
            numberMap.put(numbers[i], 1);
        }
        System.out.println(numberMap);
        System.out.println("No duplicate item found");


    }
}
