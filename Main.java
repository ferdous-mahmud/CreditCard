import java.util.Scanner;
// Main Method
public class Main{
    public static void main(String[] args){

        //creating object 
        CreditCard obj = new CreditCard("Mr. Rahim","Prime Bank Ltd.","5391037593875309",2500,3000);
        CreditCard obj2 = new CreditCard("Mr. Karim","Brack Bank Ltd.","3485039933951954",3500);
        CreditCard obj3 = new CreditCard("Mrs. Lipi","Prime Bank Ltd.","6391037593875309");

        obj.show();

        
    }
}
// Credit card class
class CreditCard{
    //Global variable for this class 
    String customer , bank , account ;
    int limit ;
    double balance;

    //constructor
    public CreditCard(String cname ,String cbank , String caccount , int clim ,double cbalance){
        customer = cname;
        bank = cbank;
        account = caccount;
        limit = clim;
        balance = cbalance;
    }
    //constructor 2
    public CreditCard(String cname ,String cbank , String caccount , int clim ){
        customer = cname;
        bank = cbank;
        account = caccount;
        limit = clim;
    }
    //constructor 3
    public CreditCard(String cname ,String cbank , String caccount ){
        customer = cname;
        bank = cbank;
        account = caccount;
    }
    // scanner for input data
    Scanner input = new Scanner(System.in);

    // method for get customer name
    public  void getCustomer(String customer){  
        customer = input.nextLine();
    }


    //update methods
    //charge method
    public boolean charge(double price){
        if(price + balance > limit)
            return false;
            balance += price;
        return true;
    }
    //makePayment method
    public void makePayment(double amount){
        balance -= amount;
    }

    //method for showing everithing
    public void show(){
        //showing account info
        System.out.println();
        System.out.println("                           Welcome!");
        System.out.println("+-------------------+--------------------+----------------------+");
        System.out.println("|   Customer Name   |   Bank Name        |   Account No         |");
        System.out.println("+-------------------+--------------------+----------------------+");
        System.out.println("|   "+customer+"       |   "+bank+"  |   "+account+"   |");
        System.out.println("+-------------------+--------------------+----------------------+");
        System.out.println();

        charge(100.9);
    }
}