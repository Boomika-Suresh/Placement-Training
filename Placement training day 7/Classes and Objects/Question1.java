package Classes;
public class Question1 {
    public static void main(String args[]){
        Account account1 = new Account(12345,"Boomika",5000);
        Account account2 = new Account(12346,"Dino",2500);
        Account.transfer(account1,1500, account2);
        System.out.println();
        Account.transfer(account2,3000, account1);
        System.out.println();
        //Account.transfer(account1,6500, account2);

    }

}
class Account
{
    int id;
    //double amount;
    String Name;
    double balance;
    Account(int id,String Name,double balance)
    {
        this.id = id;
        this.Name = Name;
        this.balance = balance;
        
    }
    //int balance = amount;
    public static int transfer(Account account1,double amount,Account account2)
    {
        if (account1.balance != 0 && account1.balance >= amount){
            account1.balance -= amount;
            account2.balance += amount;
            printReceipt(account1,account1.balance);
        }
        else{
            System.out.println("Insufficient Balance");
        }
        return 0;
    }
    public static void printReceipt(Account account,double balance)
    {
        System.out.println("Account id: "+account.id+",");
        System.out.println("Name: "+account.Name+",");
        System.out.println("Account Balance: Rs."+account.balance);

    }
}
/*
 OUTPUT:
    Account id: 12345,
    Name: Boomika,
    Account Balance: Rs.3500.0

    Account id: 12346,
    Name: Dino,
    Account Balance: Rs.1000.0  
 */
