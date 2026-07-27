package If_else_Statement;
import java.util.Scanner;
public class nested_three_five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num = sc.nextInt();
        if(num%5==0){
            if(num%3==0){
                System.out.println(num+" is divisible by 5 and 3");
            }
            else{
                System.out.println(num+" is not divisible by 3");
            }
        }
        else{
            System.out.println(num+" is not divisible by 5");

        }
    }

}
