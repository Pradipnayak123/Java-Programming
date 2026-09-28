package Patten_Printing;

import java.util.Scanner;

public class star_prymid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i=0;i<=n;i++){
            for (int j=0;j<=n;j++){
                if((i+j)>n){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
