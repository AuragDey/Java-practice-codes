//principle (p), time in years (n) and rate of interest(r)

import java.util.Scanner;

public class sI {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.printf("Enter principle(p)=");
        int p=inp.nextInt();
        System.out.printf("Enter rate of interest(r)=");
        double r=inp.nextDouble();
        System.out.printf("Enter time in years(n)=");
        int n=inp.nextInt();
        double si=(p*r*n)/100;
        System.out.printf("Simple interest is %f",si);
    }
}
