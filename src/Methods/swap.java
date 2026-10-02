package Methods;

import java.util.Scanner;

public class swap {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter n2: ");
        int n2 = sc.nextInt();
        System.out.println("n1"+" = "+n1+" n2 = "+n2);
//        int temp = n1;
//        n1 = n2;
//        n2 = temp;
        n1 = n1+n2;
        n2 = n1-n2;
        n1 = n1-n2;
        System.out.println("n1"+" = "+n1+" n2 = "+n2);
    }
}
