package Loops;
import java.util.Scanner;
public class sumofRevandNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number");
        int n = sc.nextInt();
        int realNum = n;
        int rev = 0;
        int sum = 0;
        while(n!=0){
            int rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        int result = rev+realNum;
        System.out.println(result);
    }
}
