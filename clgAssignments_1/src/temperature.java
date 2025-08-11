import java.util.Scanner;

public class temperature {
    public static void main(String[] args){
        Scanner inp= new Scanner(System.in);
        System.out.printf("Do u want to convert to celsius or fahrenheit=");
        char opt = inp.next().charAt(0);
        System.out.printf("Enter the temperature= ");
        double temp=inp.nextDouble();
        if(opt=='c'){
            double c=(temp-32)/1.8;
            System.out.printf("%f f in c is=%f\n",temp,c);
        }
        else if (opt=='f') {
            double f=(1.8*temp)+32;
            System.out.printf("%f c in f is=%f\n",temp,f);
        }

        else
            System.out.println("error!!!");

        inp.close();
    }
}
