/*
//using command line argument

public class one {
        public static void main(String [] args){
            if (args.length < 2) {
                System.out.println("Please provide a number as a command-line argument.");
                return;
            }

            int num1 = Integer.parseInt(args[0]); // Convert argument[0] to integer
            int num2 = Integer.parseInt(args[1]); // Convert argument[1] to integer
            int sum=num1+num2;

            System.out.println("Sum of digits: " + sum);
        }
}

*/

/*
//using Scanner class
import java.util.Scanner;
public class one{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.printf("Enter 1st num=");
        int n1=inp.nextInt();
        System.out.printf("Enter 2nd num=");
        int n2=inp.nextInt();
        int sum=n1+n2;
        System.out.println("Sum is "+sum);
    }
}
*/


//using BufferReader class
import java.io.*;
public class one {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("Enter 1st num=");
        int n1=Integer.parseInt(br.readLine());
        System.out.printf("Enter 2nd num=");
        int n2=Integer.parseInt(br.readLine());
        int sum=n1+n2;
        System.out.println("Sum is "+sum);
    }
}