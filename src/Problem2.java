import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {

        System.out.println("Enter the input");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

            List<Integer> series = generateSeries(a);
            System.out.println(series);
        }

        private static List<Integer> generateSeries(int a) {
            List<Integer> series = new ArrayList<>();
            series.add(1);

            int count = 1;
            int number = 1;
            while (count < a) {
                number += 2;
                series.add(number);
                count++;
            }

            return series;
        }
    }







