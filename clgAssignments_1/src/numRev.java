import java.util.Scanner;

public class numRev {
    public static void main(String []args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number= ");
        int num=inp.nextInt();
        int rev=0;
        int dig;
        while(num>0){
            dig=num%10;
            num=num/10;
            rev=rev*10+dig;
        }
        System.out.println(rev);
    }
}
