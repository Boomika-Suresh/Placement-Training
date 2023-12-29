/*
You are developing a banking application in Java. Design a class hierarchy that represents different account 
types such as SavingsAccount, CheckingAccount, and LoanAccount.
Each account should have basic functionality like deposit, withdraw, and check balance.
Ensure that your design follows appropriate use of interfaces and inheritance.
*/
package _Inheritance_;
public class Question_2 {
    public static void main(String[] args) {
        System.out.println("********************************************************************");
        System.out.println("==========================SAVINGS ACCOUNT============================");
        Accounts savings_account = new SavingsAccount(12345, "Boomika", 5000);
        savings_account.checkbalance();

        System.out.println("********************************************************************");
        System.out.println("DEPOSIT:");
        savings_account.deposit(200);
        savings_account.checkbalance();

        System.out.println("********************************************************************");
        System.out.println("WITHDRAW:");
        savings_account.withdraw(6000);
        savings_account.checkbalance(); 

        System.out.println("********************************************************************");
        System.out.println("==========================CHECKING ACCOUNT===========================");
        Accounts checking_account = new CheckingAccount(12345, "Boomika", 5000);
        checking_account.checkbalance();

        System.out.println("********************************************************************");
        System.out.println("DEPOSIT:");
        checking_account.deposit(200);
        checking_account.checkbalance();

        System.out.println("********************************************************************");
        System.out.println("WITHDRAW:");
        checking_account.withdraw(5000);
        checking_account.checkbalance(); 

        System.out.println("********************************************************************");
        System.out.println("===========================LOAN ACCOUNT=============================");
        Accounts loan_account = new LoanAccount(12345, "Boomika", 5000);
        loan_account.checkbalance();

        System.out.println("********************************************************************");
        System.out.println("DEPOSIT:");
        loan_account.deposit(200);
        loan_account.checkbalance();

        System.out.println("********************************************************************");
        System.out.println("WITHDRAW:");
        loan_account.withdraw(5000);

        //System.out.println("********************************************************************");
        loan_account.checkbalance();
        System.out.println("********************************************************************");
    }

} 
interface Accounts{
    void deposit(double amount);
    void  withdraw(double amount);
    void checkbalance();
}

class SavingsAccount implements Accounts{
    double amount;
    double balance;
    int AccountNumber;
    String AccountHolder;
    int interestRate = 5;
    double interest;
    SavingsAccount(int AccountNumber,String AccountHolder,double balance)
    {
        this.AccountNumber = AccountNumber;
        this.AccountHolder = AccountHolder;
        this.balance = balance; 
    }

    @Override
    public void deposit(double amount)
    {
        interest= balance*interestRate/100; 
        balance = balance + interest;
        if(amount>0)
        {
            balance +=amount;
            
        }else{
            System.out.println("Enter correct amount!");
        }
        
    }
    @Override
    public void withdraw(double amount)
    {
        if(amount>0 && amount<=balance)
        {
            balance -= amount;
        }
        else
        {
            System.out.println("Insufficient balance!");
        }
        
    }
    @Override
    public void checkbalance()
    {
       System.out.println("Account Holder:"+AccountHolder);
       System.out.println("Account Number:"+AccountNumber);
       System.out.println("Balance:"+balance);  
    }
}

class CheckingAccount  implements Accounts{
    double amount;
    double balance;
    int AccountNumber;
    String AccountHolder;
    double transactionfee = 25;
    CheckingAccount(int AccountNumber,String AccountHolder,double balance)
    {
        this.AccountNumber = AccountNumber;
        this.AccountHolder = AccountHolder;
        this.balance = balance; 
    }

    @Override
    public void deposit(double amount)
    {
        
        if(amount>0)
        {
            balance +=amount;
            balance -=transactionfee;
            
        }else{
            System.out.println("Enter correct amount!");
        }
        
    }
    @Override
    public void withdraw(double amount)
    {
        if(amount>0 && amount<=balance)
        {
            balance -= amount;
            balance -=transactionfee;
            
        }
        else
        {
            System.out.println("Insufficient balance!");
        }
        
    }
    @Override
    public void checkbalance()
    {
       System.out.println("Account Holder:"+AccountHolder);
       System.out.println("Account Number:"+AccountNumber);
       System.out.println("Balance:"+balance);  
    }
}

class LoanAccount  implements Accounts{
    double amount;
    double loanAmount;
    int AccountNumber;
    String AccountHolder;
    int interestRate =5;
    double interest;
    LoanAccount(int AccountNumber,String AccountHolder,double loanAmount)
    {
        this.AccountNumber = AccountNumber;
        this.AccountHolder = AccountHolder;
        this.loanAmount = loanAmount; 
    }

    @Override
    public void deposit(double amount)
    {
        
        if(amount>0)
        {
            loanAmount -= amount;
            interest= loanAmount*interestRate/100; 
            loanAmount = loanAmount + interest;
        }else{
            System.out.println("Enter correct amount!");
        }
        
    }
    @Override
    public void withdraw(double amount)
    {
            System.out.println("Cannot withdraw from a loan account!");        
    }
    @Override
    public void checkbalance()
    {
       System.out.println("Account Holder:"+AccountHolder);
       System.out.println("Account Number:"+AccountNumber);
       System.out.println("Balance loan amount:"+loanAmount);  
    }
}

/*
 OUTPUT:
    ********************************************************************
    ==========================SAVINGS ACCOUNT============================
    Account Holder:Boomika
    Account Number:12345
    Balance:5000.0
    ******************************************************************** 
    DEPOSIT:
    Account Holder:Boomika
    Account Number:12345
    Balance:5450.0
    ******************************************************************** 
    WITHDRAW:
    Insufficient balance!
    Account Holder:Boomika
    Account Number:12345
    Balance:5450.0
    ******************************************************************** 
    ==========================CHECKING ACCOUNT===========================
    Account Holder:Boomika
    Account Number:12345
    Balance:5000.0
    ******************************************************************** 
    DEPOSIT:
    Account Holder:Boomika
    Account Number:12345
    Balance:5175.0
    ******************************************************************** 
    WITHDRAW:
    Account Holder:Boomika
    Account Number:12345
    Balance:150.0
    ******************************************************************** 
    ===========================LOAN ACCOUNT=============================
    Account Holder:Boomika
    Account Number:12345
    Balance loan amount:5000.0
    ********************************************************************
    DEPOSIT:
    Account Holder:Boomika
    Account Number:12345
    Balance loan amount:5040.0
    ********************************************************************
    WITHDRAW:
    Cannot withdraw from a loan account!
    Account Holder:Boomika
    Account Number:12345
    Balance loan amount:5040.0
 */