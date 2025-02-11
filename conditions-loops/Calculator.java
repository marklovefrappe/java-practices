import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.println("--------------------");
            System.out.print("Enter operation: ");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                System.out.print("Enter two numbers: ");
                int a = in.nextInt();
                int b = in.nextInt();

                if (op == '+') {
                    ans = a + b;
                }
                
                if (op == '-') {
                    ans = a - b;
                }

                if (op == '*') {
                    ans = a * b;
                }

                if (op == '/') {
                    if (b != 0) {
                        ans = a / b;
                    }
                }

                if (op == '%') {
                    ans = a % b;
                }
            }else if (op == 'x' || op == 'X') {
                System.out.println("--------------------");
                break;
            }else {
                System.out.println("-Invalid operation-");
                ans = 0;
            }
            System.out.println("Answer: " + ans);
        }
    }
}
