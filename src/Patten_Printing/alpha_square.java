package Patten_Printing;

import java.util.Scanner;

public class alpha_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows and Colm: ");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            for (int j = 1;j<=n;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }

    }
}
