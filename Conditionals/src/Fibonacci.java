import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n");

        int a = 0;
        int b = 1;
        int n = sc.nextInt();

        if(n == 0){
            System.out.println(0);
        }
        if(n == 1){
            System.out.println(1);
        }

        int num = 0;

        for (int i = 2; i <= n; i++) {
            num = a + b;
            a=b;
            b=num;
        }

        System.out.println("Value at " + n + "th index = "+ num);

    }
}
