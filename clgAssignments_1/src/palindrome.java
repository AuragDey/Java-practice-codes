import java.util.Scanner;

public class palindrome {
    public static void main(String [] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number= ");
        int num=inp.nextInt();
        int temp=num;
        int rev=0;
        while(temp>0){
            int dig=temp%10;
            temp/=10;
            rev=rev*10+dig;
        }
        System.out.println("the reverse is "+rev);

        if(num==rev){
            System.out.println("the given number is palindrome");
        }
        else
            System.out.println("the given number is not palindrome");
    }
}
