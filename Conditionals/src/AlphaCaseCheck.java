import java.util.Scanner;

public class AlphaCaseCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char: ");
        char ch = sc.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("LowerCase");
        }else{
            System.out.println("Upper Case");
        }
    }
}
