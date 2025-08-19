import java.util.Scanner;
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int N = obj1.nextInt();

        int[] old = new int[N];
        System.out.println("Enter " + N + " numbers:");
        for (int i = 0; i < N; i++) {
            old[i] = obj1.nextInt();
        }

        System.out.print("Enter the number to remove: ");
        int rmvnum = obj1.nextInt();

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (old[i] != rmvnum) {
                count++;
            }
        }

        int[] newarray = new int[count];
        int index = 0;
        for (int i = 0; i < N; i++) {
            if (old[i] != rmvnum) {
                newarray[index++] = old[i];
            }
        }

        System.out.print("New array: ");
        for (int i = 0; i < newarray.length; i++) {
            System.out.print(newarray[i] + " ");
        }

    }