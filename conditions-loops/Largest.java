import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        System.err.print("Input 3 number to find largest: ");
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // int max = a;

        // if (b > max) {
        //     max = b;
        // }
        
        // if (c > max) {
        //     max = c;
        // }

        // int max = 0;

        // if(a > b) {
        //     max = a;
        // }else {
        //     max = b;
        // }

        // if (c > max) {
        //     max = c;
        // }


        int max = Math.max(c, Math.max(a, b));

        System.err.print("The largest number is " + max);
    }
}
