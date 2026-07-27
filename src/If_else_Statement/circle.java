package If_else_Statement;
import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 5,y=6,r=10;
        System.out.print("Enter x1: ");
        int x1 = sc.nextInt();

        System.out.print("Enter y1: ");
        int y1 = sc.nextInt();

        int distance = ((y-y1)*(y-y1)) - ((x-x1)*(x-x1));
        if(distance==r){
            System.out.println("Points lies on the Circle");

        }
        else if(distance<r){
            System.out.println("Points lies inside the Circle");
        }
        else{
            System.out.println("Points lies Outside the Circle");
        }
    }
}
