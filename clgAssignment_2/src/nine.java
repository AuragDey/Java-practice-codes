/*Design a class to represent a Bank Account. Include the following things:

        Fields
 Name of the depositor
 Account number
 Type of account
 Balance amount in the account

        Methods
 To assign initial values
 To deposit an amount
 To withdraw an amount after checking balance
 To display the name and balance*/

import java.util.Scanner;

class Bank{                                                 //new class
    String name,type;                                       //class variables
    int bal;
    int accNo;

    public Bank(String n,int a,String t,int b){             //const to initialize obj
        this.name=n;
        this.accNo=a;
        this.type=t;
        this.bal=b;
    }

    int deposit(int depoMoney){                             //method to deposit money
        bal+=depoMoney;                                     //increment balance
        return depoMoney;
    }
    int withdraw(int witMoney){                             //method to withdraw money
        if(bal>=witMoney) {                                 //checks if sufficient money
            bal = bal - witMoney;                           //decrement balance
            return witMoney;
        }
        else
            System.out.println("insufficient balance");
        return 0;
    }
    void details(){                                         //print out name and balance
        System.out.println("name= "+this.name+"|| balance= "+this.bal);
    }
}

public class nine {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.printf("Enter name= ");              //user i/p
        String nam=inp.nextLine();
        System.out.printf("Enter account no= ");
        int acNo=inp.nextInt();
        inp.nextLine();
        System.out.printf("Enter account type= ");
        String typ=inp.nextLine();
        Bank SBI=new Bank(nam,acNo,typ,0);          //obj for Bank class(SBI)
        int opt=1;
        while(opt==1||opt==2){
            System.out.printf("enter 1 to deposit or enter 2 to withdraw or enter anything to exit= ");
            opt= inp.nextInt();
            if(opt==1) {
                System.out.printf("enter deposit amount=");
                int dep=inp.nextInt();
                System.out.println("deposited amount= " + SBI.deposit(dep));        //obj.method(argument)
            }
            else if(opt==2){
                System.out.printf("enter withdraw amount=");
                int wit=inp.nextInt();
                System.out.println("withdrawn amount= " + SBI.withdraw(wit));       //obj.method(argument)
            }
            else
                System.out.println("Exiting!!!");
        }
        System.out.printf("to check details press 5= ");
        int det=inp.nextInt();
        if(det==5){
            SBI.details();                                                          //obj.method()
        }
        else
            System.out.println("BYYYY MFFFFF!!!");
    }
}
