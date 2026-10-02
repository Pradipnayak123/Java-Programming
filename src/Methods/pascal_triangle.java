package Methods;

import java.util.Scanner;
public class pascal_triangle {
public static int factorial(int n){
    int fact = 1;
    for(int i=1;i<=n;i++){
        fact*=i;
    }
    return fact;
}

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        for (int i=0;i<=n;i++){
            for(int j=0;j<=n-i;j++){//Spaces
                System.out.print(" "+" ");
            }
            for(int j=0;j<=i;j++){
                int icj = factorial(i)/(factorial(j)*factorial(i-j));
                System.out.print(icj+"   ");
            }
            System.out.println();
        }
    }
}
