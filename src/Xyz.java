import java.util.Scanner;

class Product {
    int pid;
    int price;
    int quantity;
Product(int pid,int price,int quantity)
{    this.pid=pid;
    this.price=price;
    this.quantity=quantity;
}}
public class Xyz {
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the total number of product details to be entered");
        int n = s.nextInt();
        int pid, price, quantity;
        Product[] p1 = new Product[n];
        Total t=new Total();

        System.out.println("Enter the "+n+" product details");

        for (int i = 0; i < n; i++) {
            pid = s.nextInt();
            price = s.nextInt();
            quantity = s.nextInt();
            Product p = new Product(pid, price, quantity);
            p1[i] = p;
        }
        for (int i = 0; i < n; i++)
        {
            System.out.println("Id "+p1[i].pid+" Price "+p1[i].price+" Quantity "+p1[i].quantity);
        }
        int price1=p1[0].price;
        int high=0,id=0;
        for (int i = 0; i < n; i++)
        {
          if(price1>p1[i].price)
          {
              high=price1;
              id=p1[i].pid;
          }
          else{
              high=p1[i].price;
              id=p1[i].pid;
          }
        }
        System.out.println("Highest price is "+high+" Id is "+id);
       int total= t.totalAmount(p1);
        System.out.println("Total is "+total);
    }
}
class Total {
    public static int totalAmount(Product[] p) {
    int n=p.length;
    int sum=0;
    for(int i=0;i<n;i++){
        sum=sum+p[i].price*p[i].quantity;

    }
        return sum;

}}