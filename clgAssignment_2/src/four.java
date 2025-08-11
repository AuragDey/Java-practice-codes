//Create a class First, make instance variable [int x], method [void show ()] and also put main method
//inside that class and use the instance variable and method from main.

class First{
    int x;
    void show(){
        System.out.println("show called");
    }
    public static void main(String[] args) {
        First f=new First();
        f.x=5;
        System.out.println("ip is="+f.x);
        f.show();
    }
}
