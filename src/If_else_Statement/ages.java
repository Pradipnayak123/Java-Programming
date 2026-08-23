package If_else_Statement;
import java.util.Scanner;
public class ages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of Ram: ");
        int ram = sc.nextInt();
        System.out.print("Enter the age of Shyam: ");
        int shyam = sc.nextInt();
        System.out.print("Enter the age of Ajay: ");
        int ajay = sc.nextInt();
        if(ram>shyam && ram>ajay){
            System.out.println("ram is greater than shyam and ajay");
        }
        else if(shyam>ram && shyam>ajay){
            System.out.println("shyam is greater than ram and ajay");
        }
        else{
            System.out.println("ajay is greater than ram and shyam");
        }

    }
}
