import java.util.Scanner;

class task_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string in small letters: ");
        String input = scanner.nextLine();

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                char pre;
                if(ch == 'a' ){
                    pre ='z';
                }
                else{
                    pre = (char)(ch -1);
                }
                result += pre;


            } else {

                result += ch;
            }
        }


        System.out.println("Previous alphabet string: " + result);
    }
}
