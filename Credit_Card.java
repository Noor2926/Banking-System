
/**
 * Write a description of class Credit_Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Credit_Card extends Bank_Card 
{
    private int cvc_Number;
    private double credit_Limit;
    private double intrest_Rate;
    private String expiration_Date;
    private int grace_Period;
    private boolean is_Granted;
    public Credit_Card(int card_Id,String client_Name,String issure_Bank,String bank_Account,double balance_Amount,int cvc_Number,double intrest_Rate,String expiration_Date)
    {
        super(card_Id,issure_Bank,bank_Account,balance_Amount);
        
        super.setClient_Name(client_Name);
        this.cvc_Number = cvc_Number;
        this.intrest_Rate = intrest_Rate;
        this.expiration_Date = expiration_Date;
        this.is_Granted = false;
        
    }
    public int getCvc_Number()
    {
        return this.cvc_Number;
    }
    public double getCredit_Limit()
    {
        return this.credit_Limit;
    }
    public double getIntrest_Rate()
    {
        return this.intrest_Rate;
    }
    public String getExpiration_Date()
    {
        return this.expiration_Date;
    }
    public int getGrace_Period()
    {
        return this.grace_Period;
    }
    public boolean getIs_Granted()
    {
        return this.is_Granted;
    }
    public void setCredit_Limit(double credit_Limit,int grace_Period)
    {
        if(this.credit_Limit <= 2*super.getBalance_Amount())
        {
            this.credit_Limit = credit_Limit;
            this.grace_Period = grace_Period;
            this.is_Granted = true;
            System.out.println("Congratulation your credit card is on:");
        }
        else
        {
            System.out.println("cannot issue ur credit card");
        }
    }
    public void cancelCreditCard()
    {
        this.cvc_Number = 0;
        this.credit_Limit = 0;
        this.grace_Period = 0;
        this.is_Granted = false;
        
    }
    public void Display()
    {
        super.Display();
        if (is_Granted == true)
        {
            System.out.println("Credit limit is  "+ credit_Limit);
            System.out.println("Grace period is  "+ grace_Period);
        }
        else
        {
            System.out.println("Credit limit is  "+ cvc_Number);
            System.out.println("Credit limit is  "+ intrest_Rate);
            System.out.println("Credit limit is  "+ expiration_Date);
            System.out.println("Credit limit is  "+ is_Granted);
        }
    }
    }
