public class Swap {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 20;

        // swap(a, b);

        // System.out.println("a is " + a);
        // System.out.println("b is " + b);


        String name = "Hok";
        greeting(name);

        System.out.println("name :" + name);
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a is " + a);
        System.out.println("b is " + b);
    }

    static void greeting (String naam) {
        naam = "Hok";
        System.out.println("name :" + naam);
    }
}
