import java.util.Scanner;

public class leapYear {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("enter a year=");
        int a=inp.nextInt();
        if(a%4==0||a%100==0||a%400==0)
            System.out.println(a+" is leap year");
        else
            System.out.println(a+" is not leap year");
    }
}
