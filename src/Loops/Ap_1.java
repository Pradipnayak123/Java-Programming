package Loops;
import java.util.Scanner;
public class Ap_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Last Term :");
        int n = sc.nextInt();
        for(int i=1;i<=2*n-1;i+=2){
            System.out.println(i);
        }
    }
}
