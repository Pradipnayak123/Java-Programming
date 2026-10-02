package Methods;

public class swap_using_fun {
    static void swap(int a,int b) {
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a"+" = "+a+" b = "+b);

    }
    static void main() {
        int a = 5;
        int b = 10;
        System.out.println("a"+" = "+a+" b = "+b);
        swap(a,b);

    }
}
