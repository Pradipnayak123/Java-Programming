package Methods;

public class scope_of_variable {
    static int i=10;

    static void main() {
        System.out.println(i);
        int i =20;
        System.out.println(i);
        m();
    }

    static  void m() {
        int i = 15;
        System.out.println(i);

    }
}
