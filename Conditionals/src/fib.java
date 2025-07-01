import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fib = 0;
        if(n-1 == 0){
            System.out.println(a);
        }
        if(n-1 == 1){
            System.out.println(b);
        }

        if(n>1){
            System.out.print(a + " " + b+ " ");
            for (int i = 1; i < n-1; i++) {
                fib = a+b;
                System.out.print(fib+ " ");
                a =b;
                b= fib;
            }
        }


    }
}
