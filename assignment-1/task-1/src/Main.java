import java.util.Scanner;

class OddPositiveStats {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);

        int c = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println("Enter 10 numbers = ");

        for (int i = 0; i < 10; i++) {
            int num = obj1.nextInt();

            if ((num > 0) && (num % 2 == 1)) {
                sum += num;
                c++;

                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            }
        }

        if (c == 0) {
            System.out.println("No odd positive numbers found");
        } else {
            double avg = (double) sum / c;
            System.out.println("Sum = " + sum);
            System.out.println("Average = " + avg);
            System.out.println("Minimum = " + min);
            System.out.println("Maximum = " + max);
        }


    }
}
