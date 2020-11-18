import java.util.Scanner;
// Main Method
public class Main{
    public static void main(String[] args){

        //creating object 
        CreditCard user1 = new CreditCard("Mr. Rahim","Prime Bank Ltd.","5391037593875309",2500,3000);
        CreditCard user2 = new CreditCard("Mr. Karim","Brack Bank Ltd.","3485039933951954",3500);
        CreditCard user3 = new CreditCard("Mrs. Lipi","Prime Bank Ltd.","6391037593875309");

        user1.show();

        
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
        System.out.printf("\n\n\n");
        System.out.println("1.Account Details");
        System.out.println("2.Make Payment");
        System.out.println("3.Charge\n");
        System.out.print("Please input 1 , 2 or 3 : ");

        int dis = input.nextInt();

            switch(dis){
                case 1:
                    System.out.println();
                    System.out.println("             Option 1 Selected");
                    System.out.println("+-------------------+--------------------+");
                    System.out.println("|   Account Balance |    Account Limit   |");
                    System.out.println("+-------------------+--------------------+");
                    System.out.printf("|      %.2f      |        %d        |\n",balance,limit);
                    System.out.println("+-------------------+--------------------+");
                    System.out.println();
                    break;
                
                case 2:
                    System.out.println();
                    System.out.println("             Option 2 Selected");
                    System.out.println("+-------------------+--------------------+");
                    System.out.println("|   Account Balance |    Account Limit   |");
                    System.out.println("+-------------------+--------------------+");
                    System.out.printf("|      %.2f      |        %d        |\n",balance,limit);
                    System.out.println("+-------------------+--------------------+");
                    System.out.println();
                    System.out.println();
                    System.out.print("Enter Payment amount : ");
                    double amount = input.nextDouble();
                    if(amount <= limit){
                        makePayment(amount);
                        System.out.println();
                        //display info
                        System.out.println("           Payment Successful..!");
                        System.out.println("+-------------------+--------------------+");
                        System.out.println("|   Current Balance |    Account Limit   |");
                        System.out.println("+-------------------+--------------------+");
                        System.out.printf("|      %.2f      |        %d        |\n",balance,limit);
                        System.out.println("+-------------------+--------------------+");
                        System.out.println();
                        break;
                    }
                    else{
                        System.out.println();
                        System.out.println("       Sorry! Payment limit exit...!!");
                        System.out.println();
                        break;
                    }
                    
                case 3:
                    System.out.println();
                    System.out.println("             Option 3 Selected");
                    break;
                default:
                    System.out.println("\n\n   Invalid Option...!! \n\n");
                    break;
            }
    }
}