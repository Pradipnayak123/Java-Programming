package Loops;

import java.util.Scanner;

public class xto_the_power_y {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Base :");
        int x = sc.nextInt();
        System.out.print("Enter Power :");
        int y = sc.nextInt();
        int res = 1;
        if(y==0){
            System.out.println("Undefiend");
        }
        else{
            for (int i = 0;i<y;i++){
                res = x*res;
            }
            System.out.println(res);
        }

    }
}
