package Loops;
import java.util.Scanner;
public class heist_factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num = sc.nextInt();
        int hf = 1;
        for(int i=(num-1);i>0;i--){
            if(num%i==0){
                hf = i;
                break;


            }
        }
        System.out.println("The Higest Factor of " +num+ " is " +hf);

    }
}
