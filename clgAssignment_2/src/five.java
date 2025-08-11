//Create a class; make its instance variable and method. Use them from main, declared in different class.

class sample{
    int x;
    void method_1(){
        System.out.println("method 1 called");
    }
    static void method_2(){
        System.out.println("method 2 called");
    }

    public void method_3(){
        System.out.println("method 3 called");
    }

}

public class five {
    public static void main(String[] args) {
        sample use=new sample();
        use.method_1();

        sample.method_2();

        use.method_3();

        System.out.println(use.x=5);
    }
}
