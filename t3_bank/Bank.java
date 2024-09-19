class Bank{
    public static void main(String[] args){
        System.out.println("Hello World!");
        BankAccount b1 = new BankAccount("Ram", 20000, 1230);
        String name = b1.getOwnerName();
        System.out.println(name);
        b1.printBalance();
        b1.withdraw(100);
    }
}

class BankAccount{
    private String ownerName;
    private int balance;
    private int accountNumber;

    public BankAccount(String ownerName, int balance, int accountNumber){
        this.ownerName = ownerName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public void withdraw(int amount){
        if(balance > amount){
            balance = balance - amount;
            System.out.println("Withdrawn amount: " + amount + " successfully! Current balance: " + balance);
        }else{
            System.out.println("Insufficient funds!");
        }
    }

    public void printBalance(){
        System.out.println("The balance is: " + balance);
    }
}