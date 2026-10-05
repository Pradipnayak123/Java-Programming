package Patten_Printing;

class Solution {
    public void pattern13(int n) {
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k);
                k+=1;
            }
            System.out.println();

        }

    }
    public void main(String[] args){
        int n = 4;
        pattern13(n);
    }
}
