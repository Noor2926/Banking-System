 
/**
 * Write a description of class Bank_Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bank_Card
{
    private int card_Id;
    private String client_Name;
    private String issure_Bank;
    private String bank_Account;
    private double balance_Amount;
    public Bank_Card(int card_Id,String issure_Bank,String bank_Account,double balance_Amount)
    {
        this.card_Id = card_Id;
        this.client_Name ="";
        this.issure_Bank = issure_Bank;
        this.bank_Account = bank_Account;
        this.balance_Amount = balance_Amount;

    }
    public int getCard_Id()
    {
        return this.card_Id;
    }
    public String getClient_Name()
    {
        return this.client_Name;
    }
    public String getIssure_Bank()
    {
        return this.issure_Bank;
    }
    public String  getBank_Account()
    {
        return this.bank_Account;
    }
    public double getBalance_Amount()
    {
        return this.balance_Amount;
    }
    public void setClient_Name(String client_Name)
    {
        this.client_Name = client_Name;
    }
    public void setBalance_Amount(double balance_Amount)
    {
        this.balance_Amount = balance_Amount;
    }
    public void Display()
    {
        System.out.println("card ID is "+ card_Id);
        System.out.println("Issure Bank is "+ issure_Bank);
        System.out.println("Bank account number is  is "+ bank_Account);
        System.out.println("Account balance is "+ balance_Amount);
        if(client_Name == "")
        {
            System.out.println("Please enter your name");
        }
        else
        {
            System.out.println("Your Name is "+ client_Name);
        }
    }
}
