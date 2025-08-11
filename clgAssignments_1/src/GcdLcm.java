import java.util.Scanner;

public class GcdLcm {
    static int Gcd(int x,int y){
        if(y==0)
            return x;
        return Gcd(y,x%y);          //Euclidean Algorithm
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.printf("Enter 1st num= ");
        int a=inp.nextInt();
        System.out.printf("Enter 2nd num= ");
        int b=inp.nextInt();
        int gcd=Gcd(a,b);
        int lcm=(a*b)/gcd;
        System.out.printf("lcm of %d and %d is %d\ngcd of %d and %d is %d",a,b,lcm,a,b,gcd);
    }
}
