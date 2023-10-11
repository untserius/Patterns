import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        // take input number
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a no. ");
        int n = in.nextInt();

        // create a loop for the outer rows
        for (int i = 0; i < n; i++) {
            // create a loop for columns, so that for row 1 - it prints start once, for row 2 - it prints twice and so on.
            // basically set j <= i.
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }
}
