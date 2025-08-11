//Write a program to determine sum of the following series for given value of n:
//1 - 1/2^2 + 1/3^2 - ..... + 1/n^2

import java.util.Scanner;
public class series {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.printf("enter value of n=");
        int n=inp.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++){
            sum+=Math.pow(-1,i+1)/Math.pow(i,2);
        }
        System.out.println("sum is"+sum);
    }
}
