package If_else_Statement;
import java.util.Scanner;
public class parameter_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length of The Ractangle:");
        int length = sc.nextInt();

        System.out.print("Enter the Breadth of The Ractangle:");
        int breadth = sc.nextInt();

        int area = length * breadth;
        int parameter = 2 * (length +breadth);

        if(area<parameter){
            System.out.println("Parameter is Greater than Area ");
        }
        else if(area == parameter){
            System.out.println("Area and Parameter are equal");
        }
        else{
            System.out.println("Area is Greater than Parameter ");
        }

    }
}
