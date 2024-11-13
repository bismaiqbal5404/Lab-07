
package group.lab_07_ex_02;


public class Account {
  
    private String accType;
    private double balance;

    public Account(String accountType, double balance) {
        this.accType = accountType;
        this.balance = balance;
    }
    
    public void displayInfo() {
        System.out.println("Account Type: " + accType + ", Balance: Rs" + balance);
    }
}

