import java.util.Scanner;

public class Armstrong {
    static boolean arm(int n){
        int temp1=n;
        int temp2=n;
        int sum=0,dig=0;
        while(temp1!=0) {
            temp1 /= 10;
            dig++;
        }
        while(temp2!=0){
            int rem=temp2%10;
            temp2/=10;
            sum+=(int)Math.pow(rem,dig);
        }
        return sum == n;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.printf("Enter range= ");
        int num=inp.nextInt();
        for(int i=0;i<=num;i++){
            if(arm(i))
                System.out.print(i+" ");
        }
    }
}
