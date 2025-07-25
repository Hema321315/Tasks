package Tasks;

public class BankAccount 
{
	private String ANO;
    private int bal;
 public BankAccount(String ANO, int initialBalance)
 {
   this.ANO =ANO;
 this.bal =initialBalance;
 }

//  deposit
public void deposit(int amount)
{
    if (amount > 0)
    {
        bal += amount;
    }
}

// withdraw
public void withdraw(int amount) {
    if (amount > 0 && amount <= bal)
    {
        bal -= amount;
       
}
}


public double getBalance() {               // get balance
    return bal;
}

public String getAccountNumber() {            //get account number
    return ANO;
}

}




