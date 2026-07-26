package Taking_Input;
import java.util.Scanner;
public class sum_of_two_num_input {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter The First Number :" );
        int num1 = sc.nextInt();
        System.out.print("Enter The Second  Number :" );
        int num2 = sc.nextInt();
        int sum = num1 + num2;

        System.out.println("The Sum of a And b is "+sum);
    }
}
