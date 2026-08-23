package If_else_Statement;
import java.util.Scanner;
public class lies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = sc.nextInt();

        System.out.print("Enter y : ");
        int y = sc.nextInt();

        if(x==0 && y==0){
            System.out.println("Points lies in Origin");
        }
        else if(x==0 && y!=0){
            System.out.println("Points lies in y-axis");
        }
        else if(x!=0 && y==0){
            System.out.println("Points lies in x - axis");
        }
        else{
            System.out.println("Points neither lies on x-axis nor y-axis ");
        }
    }
}
