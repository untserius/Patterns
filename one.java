import java.util.Scanner;

public class one{
    public static void main(String[] args){
        // Take a input number
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int input = in.nextInt();

        // create a loop to print stars
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}