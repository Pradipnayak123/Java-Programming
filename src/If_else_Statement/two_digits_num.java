package If_else_Statement;
import java.util.Scanner;
public class two_digits_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num = sc.nextInt();
        if (num>9 && num<100){
            System.out.println(num+ " is a Two Digit Number");
        }
        else{
            System.out.println(num+ " is not a Two Digit Number");

        }

    }
}
