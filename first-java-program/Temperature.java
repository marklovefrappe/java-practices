import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your celsius temp: ");

        float temp = input.nextFloat();
        float result = ((temp * 9/5) + 32);
        System.out.println("Temp in " +  result + " F");
    }
}
