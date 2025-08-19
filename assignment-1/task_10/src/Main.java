import java.util.Scanner;
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = obj1.nextInt();
        }

        int s = arr[0], l = arr[0];
        int ps = 0, pl = 0;

        for (int i = 1; i < 5; i++) {
            if (arr[i] < s) {
                s = arr[i];
                ps = i;
            }
            if (arr[i] > l) {
                l = arr[i];
                pl = i;
            }
        }

        System.out.println("Smallest number = " + s + " at position = " + ps);
        System.out.println("Largest number = " + l + " at position = " + pl);
    }