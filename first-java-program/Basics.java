public class Basics {
    public static void main(String[] args) {
        if(true) {
            int a = 99;
            System.out.println("Hello");
        }

        int i = 1;
        while (i != 5) {
            System.out.println(i);
            i++;
        }

        for(int count = 1; count != 5; count++) {
            System.out.println(count*2);
        }
    }
}
