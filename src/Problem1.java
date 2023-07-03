import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        while (true) {
            System.out.println(("menu:\n 1.Addition\n 2.Subtraction \n 3.Multiplication \n 4.Division \n 5.Exit"));
            System.out.println("Please select option");
            Scanner s = new Scanner(System.in);
            int menu = s.nextInt();
            if (menu == 5) {
                System.out.println("You are exited");
            } else {
                System.out.println(("Enter a two number a , b "));
                int a = s.nextInt();
                int b = s.nextInt();
                switch (menu) {
                    case 1:
                        int ans = a + b;
                        System.out.println("a+b=" + ans);
                        break;
                    case 2:
                        int sub = a - b;
                        System.out.println("a-b=" + sub);
                        break;
                    case 3:
                        int mul = a * b;
                        System.out.println("a*b" + mul);
                        break;
                    case 4:
                        try {
                            int div = a / b;
                            System.out.println("a/b" + div);
                        } catch (ArithmeticException e) {
                            System.out.println("exception occure" + e.toString());
                        }
                        break;
                    default:
                        System.out.println("Enter the valid number");

                }


            }
        }
    }
}