//(1+x+x2+x3+x4+………… up to n-th terms).

import java.util.Scanner;

public class sumOfSeries {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.printf("Enter value of n=");
        int n=inp.nextInt();
        System.out.printf("Enter the value of x=");
        int x= inp.nextInt();
        double sum=1;
        for(int i=1;i<=n;i++){
            sum=(sum+Math.pow(x,i));
        }
        System.out.printf("sum of series is %d",(int)sum);
    }
}
