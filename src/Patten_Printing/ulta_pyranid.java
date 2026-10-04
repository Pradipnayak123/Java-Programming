package Patten_Printing;

public class ulta_pyranid {

        public  void pattern8(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = n - i; j >= 0; j++) {
                    System.out.print(" ");
                }
                for (int j = n; j >= 2 * i - 1; j++) {

                    System.out.print("*");


                }
                System.out.println();
            }
        }

        public  void main(String[] args){
            int num = 4;
            pattern8(num);
        }
    }

