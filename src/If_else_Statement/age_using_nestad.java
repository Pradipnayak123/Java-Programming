package If_else_Statement;
import java.util.Scanner;
public class age_using_nestad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Ram age: ");
        int ram = sc.nextInt();

        System.out.print("Enter Shyam age: ");
        int shyam = sc.nextInt();

        System.out.print("Enter Ajay age: ");
        int ajay = sc.nextInt();

        if(ram > shyam){
            if(ram > ajay){
                System.out.println("Ram is Greater than Ajay and Shyam");
            }
            else{
                System.out.println("Ajay is Greater than Ram and Shyam");
            }
        }
        else{
            if(shyam > ajay){
                System.out.println("Shyam is Greater than Ajay and Ram");
            }
            else{
                System.out.println("Ajay is Greater than Shyam and Ram");
            }
        }
    }
}
