import java.util.Scanner;

public class reversArray {
    public static void main(String[] args) {
        Scanner ob1  = new Scanner(System.in);


        System.out.print("Enter the length of the array = ");
        int length = ob1.nextInt();


        int[] arr = new int[length];
        System.out.println("Enter " + length + " values = ");
        for (int i = 0; i < length; i++) {
            arr[i] = ob1.nextInt();
        }


        for (int i = 0; i < length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[length - 1 - i];
            arr[length - 1 - i] = temp;
        }


        System.out.println("Reversed array =");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
