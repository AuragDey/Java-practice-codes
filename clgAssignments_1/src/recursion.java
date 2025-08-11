import java.util.Scanner;

public class recursion {
    static long rec(long a){
        if(a==0||a==1)
            return 1;
        return (a*rec(a-1));
    }

    public static void main(String [] args){
        Scanner inp=new Scanner(System.in);
        System.out.printf("Enter a number=");
        long num=inp.nextLong();
        long fac=rec(num);
        System.out.printf("factorial of %d is %d",num,fac);
    }
}
