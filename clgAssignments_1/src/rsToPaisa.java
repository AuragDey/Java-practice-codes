import java.util.Scanner;

public class rsToPaisa {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.printf("Enter an amount is rupees = ");
        double rs=inp.nextDouble();
        int paisa=(int)(rs*100);
        System.out.printf("the rupees %f is %d paisa",rs,paisa);
    }
}
