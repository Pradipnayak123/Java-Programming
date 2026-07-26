package Taking_Input;
import java.util.Scanner;
public class find_remander {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int num1 = sc.nextInt();
        System.out.print("Enter second Number :");
        int num2 = sc.nextInt();
        int rem = num1%num2;
        System.out.println("The Remainder is :"+rem);

    }
}
