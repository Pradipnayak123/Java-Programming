package If_else_Statement;
import java.util.Scanner;
public class div_by_five_or_3_but_not_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int num = sc.nextInt();
//        if(num%3==0 || num%5==0){
//            if(num%15!=0){
//                System.out.println(num+" is divisible by 3 or 5 but not divisible by 15.");
//            }
//            else{
//                System.out.println(num+" is divisible by 5 or 3 and 15");
//            }
//        }
//        else{
//            System.out.println(num+" is not divisible by 5 or 3 ");
//        }



                if((num%3==0 || num%5==0) && num%15!=0){
                    System.out.println(num+" is divisible by 3 or 5 but not divisible by 15.");

        }
                else{
                    System.out.println("nothing ");
                }

    }
}
