import java.util.Scanner;

public class sumOfNum {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number= ");
        int dig=inp.nextInt();
        int sum=0;
        int num=dig;
        while(num>0){
            sum+=num%10;
            num=num/10;
        }
        System.out.printf("sum of digits of %d is %d",dig,sum);
    }
}
