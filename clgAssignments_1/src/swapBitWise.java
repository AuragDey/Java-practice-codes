import java.util.Scanner;

public class swapBitWise {
    public static void main(String [] args){
        Scanner inp=new Scanner(System.in);
        System.out.printf("enter 1st number=");
        int a=inp.nextInt();
        System.out.printf("enter 2nd number=");
        int b=inp.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
