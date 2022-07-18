public class Main {
    public static void main(String[] args) {
        int salary = 65535;
        int total = 0;
        int i = 0;
        for (; total < 10_000_000; i ++) {
            total = total + total / 100 + salary;
            if (i % 5 == 0) {
                System.out.println("Месяц " + i + " итого " + total);
            }
            System.out.println( total);
            System.out.println(i);
        }
    }
}