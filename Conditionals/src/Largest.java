import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers to find max: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;

        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        System.out.println("max " + max);

        //=================== USING Math.max(a , b)

        int maxx = Math.max(c, Math.max(a,b));
        System.out.println("maxx: "+ maxx);
    }

}
