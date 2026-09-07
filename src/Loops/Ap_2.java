package Loops;
import java.util.Scanner;
public class Ap_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Last Term: ");
        int n = sc.nextInt();
        //1,4,7,10 .... n
//        for(int i=1;i<=3*n+1;i+=3){
//            System.out.print(i+" ");
//        }
        int a=1,d=3;
        for(int i=0;i<=n;i++){
            System.out.println(a);
            a+=d;
        }
    }
}
