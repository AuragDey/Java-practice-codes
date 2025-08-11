import java.util.Scanner;

public class evenOdd {
    public static void main(String [] args){
        Scanner inp=new Scanner(System.in);
        System.out.printf("enter a number=");
        long num=inp.nextLong();
        if(num%2==0)
            System.out.printf("%d is even",num);
        else
            System.out.printf("%d is odd",num);
    }
}
