import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 2 numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();

        int result = sum(a, b);
        System.out.println("The result is " + result);

    }

    static int sum(int a, int b) {
        return a + b;
    }
} 