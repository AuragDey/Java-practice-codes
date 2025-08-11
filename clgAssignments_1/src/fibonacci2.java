import java.util.Scanner;

public class fibonacci2 {
    static int fibo(int n){
        if(n==1||n==0)
            return n;
        return fibo(n-1)+fibo(n-2);
    }

    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.printf("enter the maximum value=");
        int max=inp.nextInt();
        for(int i=0;;i++){
            int term=fibo(i);
            if(term>=max){
                break;
            }
            System.out.print(term+" ");
        }
    }
}
