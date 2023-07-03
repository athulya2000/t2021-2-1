import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {

        System.out.println("Enter the input");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();


        List<Integer> series = generateSeries(a);
        System.out.println(series);
    }

    private static List<Integer> generateSeries(int a) {
        List<Integer> series = new ArrayList<>();

        for (int i =1; i <=a; i++) {
            series.add(2 * i - 1);
        }

        return series;
    }
}