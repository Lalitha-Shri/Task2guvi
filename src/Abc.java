import java.util.Scanner;

class Account {
    int balance;
    int accountNo;
    Account()
    {
    balance=0;
    }
    Account(int balance,int accountNo){
        this.balance=balance;
        this.accountNo=accountNo;
    }
    public void deposit(int amount)
    {
        balance=amount+balance;
        System.out.println(balance);
    }
    public void withdraw(int amount)
    {
        if(amount>balance)
        {
            System.out.println("cannot withdraw");
        }
        else{
        balance=balance-amount;
        System.out.println(balance);}
    }
    public  void display(){
        System.out.println("Account No "+ accountNo+" Balance "+balance);
    }
}
public class Abc{
    public static void main(String[] arg)
    {
        System.out.println("enter the initial balance");
        Scanner n=new Scanner(System.in);
        int amount=n.nextInt();
        System.out.println("Enter your account no");
        int acc=n.nextInt();
        Account a=new Account(amount,acc);
        System.out.println("enter the amount to be deposited");
        int a1=n.nextInt();
        a.deposit(a1);
        System.out.println("enter the amount to be withdrawn");
        int a2=n.nextInt();
        a.withdraw(a2);
        a.display();

    }
}
