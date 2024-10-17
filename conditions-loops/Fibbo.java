import java.util.Scanner;

public class Fibbo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        // int sum = 0;
        int count = 2;

        if (n == 0) {
            System.out.println(a);
        } else if (n == 1) {
            System.out.println(b);
        } else {
            // for (int i = 2; i <= n ; i++) {
            //     sum = a + b;
            //     a = b;
            //     b = sum;
            // }

            // System.out.println(sum);

            while (count <= n) {
                int temp = b;
                b = a + b;
                a = temp;
                count++;
            }
            System.out.println(b);
        }

    };
}
