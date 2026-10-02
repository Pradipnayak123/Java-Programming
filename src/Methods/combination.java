package Methods;

import java.util.Scanner;

public class combination {

    public static int factorial(int num) {
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact = fact*i;
        }
        return fact;

    }

    public static int cpr(int n,int r){
//        System.out.println(factorial(4));
        int x = factorial(n);
        int y = factorial(n-r);
        int z = factorial(r);
        int cpr = x/z*y;
        return cpr;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        System.out.print("Enter r:");
        int r = sc.nextInt();
        System.out.println(cpr(n,r));

    }
}
