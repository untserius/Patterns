public class ten {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= 2*n-1; i++) { // outer loop
            int stars = i;

            if (i > n) {stars = 2*n - i;} // after row(i) 5th, change the value of star

            for (int j = 1; j <= stars; j++) { // inner loop
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
