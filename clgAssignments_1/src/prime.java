import java.util.Scanner;

public class prime {
    static boolean prm(int n, int i){
        if(n<=1)
            return false;
        if(i==1)
            return true;
        if(n%i==0)
            return false;
        return (prm(n,i-1));
    }

    public static void main(String [] args){
        Scanner inp=new Scanner(System.in);
        System.out.printf("Enter the number= ");
        int n=inp.nextInt();
        if(prm(n,n/2))
            System.out.println(n+" is a prime number");
        else
            System.out.println(n+" is not a  prime number");
    }
}
