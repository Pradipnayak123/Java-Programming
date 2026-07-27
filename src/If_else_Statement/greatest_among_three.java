package If_else_Statement;
import java.util.Scanner;
public class greatest_among_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println(a+ " is greater than "+b+" and "+c);
            }
            else{
                System.out.println(c+ " is greater than "+b+" but less than "+a);
            }
        }
        else{
           if(b>c){
               System.out.println(b+ " is greater than "+c+" but less than "+a);
           }
           else{
               System.out.println(c+ " is greater than "+b+" but less than "+a);

           }

        }
    }
}
