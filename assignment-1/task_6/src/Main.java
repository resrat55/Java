import java.util.Scanner;
public static void main (String[] args){
    Scanner obj1 = new Scanner(System.in);
    System.out.print("Enter the number fo eliment = ");
    int n= obj1.nextInt();
    int[] array = new int[n];
    System.out.print(" Enter "+ n + "numbers = ");
    for(int i=0 ;i<n;i++){
        array[i]=obj1.nextInt();


    }
    boolean[] counted = new boolean[n];


    System.out.println("Numbers are appers  = ");
    for (int i = 0; i < n; i++) {
        if (!counted[i]) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    count++;
                    counted[j] = true;
                }
            }
            System.out.println(array[i] + " appears " + count + " times.");
        }
    }



}