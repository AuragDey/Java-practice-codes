import java.util.Scanner;

public class arithmeticOp {
    public static void main(String [] args){
        Scanner inp=new Scanner(System.in);
        System.out.printf("Enter one number=");
        double n1=inp.nextDouble();
        System.out.printf("Enter another number=");
        double n2=inp.nextDouble();
        System.out.printf("Enter operation to be performed=");
        char op=inp.next().charAt(0);
        switch (op){
            case '+':
                System.out.printf("sum of %f and %f is %f",n1,n2,n1+n2);
                break;
            case '-':
                System.out.printf("sub of %f and %f is %f",n1,n2,n1-n2);
                break;
            case '*':
                System.out.printf("prod of %f and %f is %f",n1,n2,n1*n2);
                break;
            case '/':
                System.out.printf("div of %f and %f is %f",n1,n2,n1/n2);
                break;
            default:
                System.out.println("wrong option!!!");
        }
    }
}
