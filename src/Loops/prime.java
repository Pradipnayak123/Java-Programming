package Loops;
import java.security.cert.TrustAnchor;
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        boolean is_prime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                is_prime = false;
                break;
            }

        }
        if(n==1){
            System.out.println("1 is neither Prime Nor Composite");
        }
        else if (is_prime == true) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n+" is a Composite Number");
        }
    }
}

