package Loops;
import java.util.Scanner;
public class newloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        System.out.println("Hello java!");
        int a = sc.nextInt();
        int sum=0;
        for(int i = 0;i<=a;i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
