import java.util.Scanner;

public class fibnacci1 {
    static int fibo(int n){
        if(n==0||n==1)
            return n;
        return fibo(n-1)+fibo(n-2);
    }

    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.printf("Enter number of terms=");
        int n=inp.nextInt();
        for(int i=0;i<=n;i++)
            System.out.print(fibo(i)+" ");
    }
}
