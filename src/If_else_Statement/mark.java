package If_else_Statement;
import java.util.Scanner;
public class mark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();
        if(marks<=100 && marks>90){
            System.out.println("Excellent");
        }
        else if(marks<=90 && marks>80) {
            System.out.println("Very Good");
        }
        else if(marks<=80 && marks>70){
            System.out.println("Can Do Better");
        }
        else if(marks<=60 && marks>50){
            System.out.println("Average");
        }
        else if(marks<=50 && marks>40){
            System.out.println("Below Average");
        }
        else{
            System.out.println("Fail");
        }
    }

}
