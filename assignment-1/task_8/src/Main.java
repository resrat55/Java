import java.util.Scanner;

    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);

        System.out.print("Enter the size of the matrix = ");
        int n = obj1.nextInt();

        int[][] a = new int[n][n];

        System.out.println("Enter the elements of the matrix = ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = obj1.nextInt();
            }
        }

        boolean isIdentity = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && a[i][j] != 1) {
                    isIdentity = false;
                    break;
                } else if (i != j && a[i][j] != 0) {
                    isIdentity = false;
                    break;
                }
            }
            if (!isIdentity) {
                break;
            }
        }

        if (isIdentity) {
            System.out.println("Identity matrix");
        } else {
            System.out.println("Not an Identity matrix");
        }

    }
