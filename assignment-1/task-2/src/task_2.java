import java.util.Scanner;

public class task_2 {

    public static boolean isPrime(int num) {
        if (num < 2){
            return false;
        }
        for (int i = 2; i <= num-1 ; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number = ");
        int a = scanner.nextInt();
        System.out.print("Enter second number = ");
        int b = scanner.nextInt();

        int x= Math.min(a, b);
        int y= Math.max(a, b);
        int count = 0;
        for (int i =x ; i < y; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number = "+count);

            }
        }
        System.out.println("Number of prime numbers between " + a + " and " + b + " is = " + count);
    }
}
