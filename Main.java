import java.util.Scanner;
// Main Method
public class Main{
    public static void main(String[] args){

        //creating object for CreditCard class
        CreditCard obj = new CreditCard("Ferdous","Brack Bank","CSE-1190320404",10000,1000.50);

        obj.getCustomer();
        obj.show();
    }
}
// Credit card class
class CreditCard{
    //Global variable for this class 
    String customer , bank , account ;
    int limit ;
    double balance;
    String cname;

    //constructor
    CreditCard(String cname ,String cbank , String caccount , int clim ,double cbalance){
        customer = cname;
        bank = cbank;
        account = caccount;
        limit = clim;
        balance = cbalance;
    }
    
    // scanner for input data
    Scanner input = new Scanner(System.in);

    // method for get customer name
    String getCustomer(){  
        cname = input.nextLine();
        return cname;
    }

    //method for showing everithing
    void show(){
        System.out.println("Customer Name : "+cname);
    }

}