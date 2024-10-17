import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = in.next();

        System.out.print("Enter your age: ");
        int age = in.nextInt();

        String result = greeting(name, age);
        System.out.println(result);
    }

    static String greeting(String name, int age) {
        return "My name is " + name + ", I am " + age + " years old";
    }
}
