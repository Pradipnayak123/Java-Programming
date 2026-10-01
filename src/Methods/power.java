package Methods;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
//        System.out.println(Math.pow(2.1,3.653));
//        System.out.println(Math.max(2,Math.max(3,4)));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1:");
        int n1 = sc.nextInt();

        System.out.print("Enter n2:");
        int n2 = sc.nextInt();

        System.out.print("Enter n3:");
        int n3 = sc.nextInt();

        System.out.print("Enter n4:");
        int n4 = sc.nextInt();

        System.out.println(Math.min(Math.min(n1,n2),Math.min(n3,n4)));

    }
}
