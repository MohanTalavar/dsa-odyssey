import java.util.Scanner;

public class tester {

    public static void main(String[] args) {
        System.out.println("Hello Welcome to DSA Journey ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("Op");
        for (int i = 1; i <= n; i++) {

            System.out.print(i + " " );
        }

    }
}
