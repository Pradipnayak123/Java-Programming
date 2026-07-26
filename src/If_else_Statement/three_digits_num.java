package If_else_Statement;
import java.util.Scanner;
public class three_digits_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num = sc.nextInt();
        if (num>99 && num<1000){
            System.out.println(num+ " is a Three Digit Number");
        }
        else{
            System.out.println(num+ " is not a Three Digit Number");

        }

    }
}
