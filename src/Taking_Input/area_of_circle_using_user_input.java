package Taking_Input;
import java.util.Scanner;
public class area_of_circle_using_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius:");
        int radius = sc.nextInt();
        double area = 3.14 * radius * radius;
        System.out.println("The Area of The Circle is :"+area);
    }
}
