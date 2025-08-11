import java.util.Scanner;

class cylinder{
    double r,l;
    public cylinder(double r,double l){
        this.r=r;
        this.l=l;
    }
    double circumference(double r){
        return 2*Math.PI*r;
    }
    double SA(double r,double l){
        return 2*Math.PI*r*(r+l);
    }
}

public class two {
    public static void main(String[] args) {

        //command line argument
        /*if(args.length<2){
            System.out.println("provide command line argument");
            return;
        }
        double rad=Integer.parseInt(args[0]);
        double height=Integer.parseInt(args[1]);*/

        Scanner inp=new Scanner(System.in);
        System.out.printf("Enter radius=");
        double rad=inp.nextDouble();
        System.out.printf("Enter height=");
        double height=inp.nextDouble();
        cylinder cy=new cylinder(rad,height);
        System.out.println("Circumference is "+cy.circumference(rad));
        System.out.println("Area is "+cy.SA(rad,height));
    }
}
