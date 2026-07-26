package If_else_Statement;
import java.util.Scanner;
public class div_by_5_and_not_by_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number");
        int num  = sc.nextInt();
        if(num%5==0 && num%3!=0){
            System.out.println("Number is divisible by 5 but not divisible by 3");
        }
        else{
            System.out.println("___");
        }
    }
}
