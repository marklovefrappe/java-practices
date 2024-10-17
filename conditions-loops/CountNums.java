import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number: ");
        int input = in.nextInt();

        System.out.print("Enter target: ");
        int target = in.nextInt();
        
        
        int count = 0;

        while (input > 0) {
            int remainder = input % 10;
            if (remainder == target) {
                count++;
            }
            input = input / 10;
        }
        System.out.println(count);
    }
}