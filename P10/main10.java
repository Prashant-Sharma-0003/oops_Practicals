class BankAccount { 
public BankAccount(String accountHolder, String accountNumber, double initialBalance) { 
    this.accountHolder = accountHolder; 
    this.accountNumber = accountNumber; 
    if (initialBalance >= 0)  
{ 
    this. Balance = initialBalance; 
} else { 
        this.balance = 0.0; 
        System.out.println("Initial balance cannot be negative. Set to ₹0.0"); 
    } 
} 
 public String getAccountHolder() { 
    return accountHolder; 
} 
 public String getAccountNumber() { 
    return accountNumber; 
} 
 public double getBalance() { 
    return balance; 
} 
public void deposit(double amount) { 
    if (amount > 0) { 
        balance += amount; 
        System.out.println("Successfully deposited: ₹" + amount); 
    } else { 
        System.out.println("Deposit failed: Negative or zero deposit amount is rejected[span_3](start_span)[span_3](end_span)!"); 
    } 
} 
public void withdraw(double amount) { 
    if (amount <= 0) { 
        System.out.println("Withdrawal failed: Zero or negative withdrawals are rejected[span_5](start_span)[span_5](end_span)!"); 
    } else if (amount > balance) { 
        System.out.println("Withdrawal failed: Amount greater than the available balance is rejected[span_6](start_span)[span_6](end_span)!"); 
    } else { 
        balance -= amount; 
        System.out.println("Successfully withdrew: ₹" + amount); 
    } 
} 
public void displayAccountInfo() { 
    System.out.println("Account Holder: " + accountHolder); 
    System.out.println("Account Number: " + accountNumber); 
    System.out.println("Current Balance: ₹" + balance); 
    System.out.println("-----------------------------------"); 
} 
} 
public class Main { public static void main(String[] args) 
   System.out.println("--- Initial Account Details ---"); 
    myAccount.displayAccountInfo(); 
System.out.println("--- Testing Valid Transactions ---"); 
    myAccount.deposit(5000.0); 
    myAccount.withdraw(3000.0); 
    myAccount.displayAccountInfo(); 
    System.out.println("--- Testing Invalid Transactions ---"); 
    myAccount.deposit(-1500.0); 
    myAccount.withdraw(0); 
    myAccount.withdraw(50000.0); 
 
    System.out.println("\n--- Final Account Details ---"); 
    myAccount.displayAccountInfo(); 
} 
  

} 

 

 
