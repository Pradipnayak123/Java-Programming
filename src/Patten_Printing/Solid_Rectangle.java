package Patten_Printing;

import java.util.Scanner;

public class Solid_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. of Rows: ");
        int m = sc.nextInt();
        System.out.print("Enter No. of Cols: ");
        int n = sc.nextInt();
        for(int i = 1;i<=m;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
