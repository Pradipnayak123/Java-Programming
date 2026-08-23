package If_else_Statement;
import java.util.Scanner;
public class absolute_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        if (num<0) {
            int pos = num*(-1);
            System.out.println("The Absolute Value is of "+num+" is "+pos);

        }
        else {
            System.out.println("The Absolute Value of "+num+" is "+num);
        }
    }
}
