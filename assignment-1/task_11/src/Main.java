import java.util.Scanner;
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter how many numbers to take = ");
        int n = obj1.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers = ");
        for (int i = 0; i < n; i++) {
            arr[i] = obj1.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        double middel;
        if (n % 2 == 0) {
            middel = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        } else {
            middel = arr[n / 2];
        }

        System.out.println("Median value = " + middel);
    }