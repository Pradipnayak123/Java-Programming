package If_else_Statement;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class cp_sp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //cost Price

        System.out.print("Enter Cost Price : ");
        double cp = sc.nextInt();
        //selling Price

        System.out.print("Enter selling Price : ");
        double sp = sc.nextInt();
        if(cp<sp){
          double  profit = sp-cp;
            System.out.println("You made Profit 0f "+profit+" rupees");
        }
        else{
            double loss = cp - sp;
            System.out.println("You are in loss of "+loss+" rupees");
        }
    }


}
