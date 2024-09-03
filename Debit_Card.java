
/**
 * Write a description of class Debit_Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Debit_Card extends Bank_Card
{
    private int pin_Number;
    private int withdrawal_Amount;
    private String date_of_Withdrawal;
    private boolean has_Withdrawn;
    
    public Debit_Card(int card_Id,String client_Name,String issure_Bank,String bank_Account,double balance_Amount,int pin_Number)
    {
       super(card_Id,issure_Bank,bank_Account,balance_Amount);
       super.setClient_Name(client_Name);
       this.pin_Number = pin_Number;
       this.has_Withdrawn = false;
    }
    public int getPin_Number()
    {
        return this.pin_Number;
    }
    public int getWithdrawal_Amount()
    {
           return this.withdrawal_Amount;
    }
    public String getDate_of_Withdrawal()
    {
           return this.date_of_Withdrawal;
    }
    public boolean getHas_Withdrawn()
    {
           return this.has_Withdrawn;
    }
    public void setWithdrawal_Amount(int withdrawal_Amount)
    {
           this.withdrawal_Amount = withdrawal_Amount;
    }
    public void Withdrawn(int pin_Number,int withdrawal_Amount,String date_of_Withdrawal)
    {
        if(pin_Number == pin_Number && withdrawal_Amount <= super.getBalance_Amount())
        {
         this.has_Withdrawn = true;
         super.setBalance_Amount(this.getBalance_Amount()-withdrawal_Amount);
         this.withdrawal_Amount=withdrawal_Amount;
         this.date_of_Withdrawal =date_of_Withdrawal;
         
         System.out.println("Your amount has wirhdrawn");
         System.out.println("Your withdrawan amount is:" + withdrawal_Amount);
         System.out.println("Your remaining balance is:"+ super.getBalance_Amount());
         System.out.println("Date of withdrawan :" + date_of_Withdrawal);
        }
        else
        {
            System.out.println("Incorrect PIN Number or Insufficient Account_Balance ");
        }
    } 
    public void Display()
    {
         super.Display();
         if(has_Withdrawn == true)
         {
         System.out.println("PIN_Number is " + pin_Number);
         System.out.println("Withdrawal_Amount is " + withdrawal_Amount);
         System.out.println("Withdrawal-Date is " + date_of_Withdrawal);
         }
         else
         {
             System.out.println("your balance amount is "+ getBalance_Amount());
         }
    }
}

