package Loops;
import java.util.Scanner;
public class prouct_of_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = sc.nextInt();
        int pro = 1;
        while(n!=0){
            int ld = n%10;
            pro = pro*ld;
            n=n/10;


        }
        System.out.println(pro);
    }
}
