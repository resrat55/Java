import java.util.Scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements = ");
        int n = scanner.nextInt();

        double[] old = new double[n];
        for (int i = 0; i < n; i++) {
            old[i] = scanner.nextDouble();
        }

        double[] temp = new double[n];
        int l = 0;

        if (n > 0) {
            temp[l++] = old[0];
            for (int i = 1; i < n; i++) {
                if (old[i] != old[i - 1]) {
                    temp[l++] = old[i];
                }
            }
        }

        int count = n - l;
        System.out.println("Number of elements removed = " + count);

        System.out.print("Array without duplicates = ");
        for (int i = 0; i < l; i++) {
            System.out.print(temp[i] + " ");
        }

    }
