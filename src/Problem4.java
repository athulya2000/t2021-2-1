import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30);

        Map<Integer, Integer> multiplesCount = getMultiplesCount(numbers);
        System.out.println(multiplesCount);
    }

    private static Map<Integer, Integer> getMultiplesCount(List<Integer> numbers) {
        Map<Integer, Integer> multiplesCount = new HashMap<>();

        for (int i = 1; i <= 9; i++) {
            multiplesCount.put(i, 0);
        }

        for (Integer number : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (number % i == 0) {
                    multiplesCount.put(i, multiplesCount.get(i) + 1);
                }
            }
        }

        return multiplesCount;
    }
}
