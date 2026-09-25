package Loops;
import java.util.Scanner;
public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int count = 0;
        int n = sc.nextInt();
       while(n!=0){
           n/=10;
           count+=1;
       }
        System.out.println(count);

    }
}
