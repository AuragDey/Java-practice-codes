import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.printf("Enter a number= ");
        int n=inp.nextInt();
        int factors=0,sum=0;
        System.out.printf("Factors are= ");
        for(int i=1;i<n;i++){
            if(n%i==0){
                factors=i;
                sum=sum+factors;
                System.out.printf("%d ",factors);
            }
        }
        if(sum==n)
            System.out.printf("\n %d is perfect num",n);
        else
            System.out.printf("\n %d is not perfect num",n);
    }
}
