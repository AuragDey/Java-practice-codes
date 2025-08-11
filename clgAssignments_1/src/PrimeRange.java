import java.util.Scanner;

public class PrimeRange {
    static boolean rngPrm(int n,int i){
        if(n<=1)
            return false;
        if(i==1)
            return true;
        if(n%i==0)
            return false;
        return (rngPrm(n,i-1));
    }

    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.printf("Enter the range= ");
        int n=inp.nextInt();
        for(int i=0;i<=n;i++){
            if(rngPrm(i,(int)Math.sqrt(i)))
                System.out.print(i+" ");
        }
    }
}
