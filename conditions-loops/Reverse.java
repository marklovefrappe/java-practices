import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter number: ");
        int number = in.nextInt();

        int ans = 0;

        while (number > 0) {
            int last = number % 10;
            ans = (ans * 10) + last;
            number = number / 10;
        }

        System.err.print(ans);
    }
}
