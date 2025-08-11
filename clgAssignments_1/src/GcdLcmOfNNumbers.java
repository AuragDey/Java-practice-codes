import java.util.Scanner;

public class GcdLcmOfNNumbers {
    static int gcd(int a,int b){
            if(b==0)
                return a;
            return (gcd(b,a%b));
        }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.printf("Enter total numbers= ");
        int n=inp.nextInt();

        int[] arr = new int[n];
        System.out.printf("Enter the digits=");
        for (int i = 0; i < n; i++) {
            arr[i]=inp.nextInt();
        }
        
        int g = arr[0];
        int l= arr[0];
        for (int i = 1; i <n ; i++) {
            g=gcd(g,arr[i]);
            l=(l*arr[i])/gcd(l,arr[i]);
        }
        System.out.printf("lcm=%d\nhcf=%d",l,g);

    }
}
