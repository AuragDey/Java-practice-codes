import java.util.Scanner;

class cone{
    double r,l;
    public cone(double r,double l){
        this.r=r;
        this.l=l;
    }
    double area(double r,double l){
        return Math.PI*r*(r+l);
    }
    double vol(double r,double l){
        return (1.0/3*Math.PI*r*r*l);
    }
}

public class three {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.printf("Enter length= ");
        double len= inp.nextDouble();
        System.out.printf("Enter radius= ");
        double rad= inp.nextDouble();
        cone c=new cone(rad,len);
        System.out.println("area= "+c.area(rad,len));
        System.out.println("volume="+c.vol(rad,len));
    }
}
