public class Conditionals {
    public static void main(String[] args) {
        int salary = 5001;
        
        // IF-else statements
        // if(salary > 5000) {
        //     salary += 10000;
        // } else {
        //     salary += 5000;
        // }

        // Multiple if-else statements
        if(salary > 20000) {
            salary += 20000;
        } else if (salary > 10000) {
            salary += 10000;
        } else {
            salary += 5000;
        }

        System.out.println(salary);
    }
}