package If_else_Statement;
import java.util.Scanner;
public class even_and_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        if(num%2==1){
            System.out.println(num+ " is a odd Number" );
        }
        else{
            System.out.println(num+ " is a even Number" );
        }
    }
}
