package If_else_Statement;
import java.util.Scanner;
public class stright_line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1: ");
        int x1 = sc.nextInt();

        System.out.print("Enter y1: ");
        int y1 = sc.nextInt();

        System.out.print("Enter x2: ");
        int x2 = sc.nextInt();

        System.out.print("Enter y2: ");
        int y2 = sc.nextInt();

        System.out.print("Enter x3: ");
        int x3 = sc.nextInt();

        System.out.print("Enter y3: ");
        int y3 = sc.nextInt();

        if((y2-y1)/(x2-x1) == (y3-y2)/(x3-x2)){
            System.out.println("Straight Line");
        }
        else{
            System.out.println("Not a Stright line");
        }
    }
}
