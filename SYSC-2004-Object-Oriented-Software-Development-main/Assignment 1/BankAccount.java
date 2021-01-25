
/**
 * Write a description of class BankAccount here.
 *
 * @author (Youssef Ibrahim)
 * @version (26-01-2020)
 */
class BankAccount
{
    private double crrntBalance;	   
    private String accntNmbr; 
    
    public BankAccount()
    {  
        accntNmbr="123456"; // sets the account number
        crrntBalance= 999; //  sets the current balance of the account
    }

//constructor that passes two values to set an account number and an initial balance
    public BankAccount(String accntNum, double initialBalance)
    {  
        accntNmbr = accntNum; //passes the value of the account number 
        crrntBalance = initialBalance; //passes the value of the initial balance 
    }

// mutator to debit account
    public void debit(double debitNum)	
    { 
        double newBlnc = crrntBalance - debitNum; 
        crrntBalance = newBlnc;			
    }

// mutator to credit account 
    public void credit(double creditNum)	
    { 
        double newBlnc = crrntBalance + creditNum; 
        crrntBalance = newBlnc;				
    }

// accessor to return the current balance
    public double GetcrrntBalance()	
    { 
        return crrntBalance;			
    }
    
//to print out account information
    public void printAccntinformation()	
    { 
        System.out.println("Account number:"+ accntNmbr); //  display the account number 
        System.out.println("Current balance:" + crrntBalance + "CAD"); // display the current balance	
    }
}