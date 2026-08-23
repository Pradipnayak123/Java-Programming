package If_else_Statement;
import java.util.Scanner;
public class div_by_5_or_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num = sc.nextInt();
        if(num%3==0 || num%5==0){
            System.out.println(num+" is Divisible by 5 or 3");
        }
        else{
            System.out.println(num+" is  not Divisible by 5 or 3");

        }
    }

}
