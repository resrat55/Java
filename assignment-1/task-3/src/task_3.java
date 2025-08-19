import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter first word = ");
        String a = scanner.next();

        System.out.print("Enter second word = ");
        String b = scanner.next();


        String result = a + " " + b;

        int sum = 0;
        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);
            sum = sum + (int) ch;
        }


        System.out.println("Concatenated String = " + result);
        System.out.println("Sum of ASCII values = " + sum);

    }
}