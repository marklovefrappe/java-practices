import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Print number from 1 to 5
        // for (int i = 1; i <= 5; i++) {
        //     System.out.println(i);
        // }

        // Print number from 1 to n
        System.out.print("Enter number of n: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // for(int number = 1; number <= n; number += 1) {
        //     System.out.println(number);
        // }

        int number = 1;
        // while (number <= n) {
        //     System.out.println(number);
        //     number+=1;
        // }

        do {
            System.out.println(number);
            number+=1;
        } while (number <= n);
    }
}
