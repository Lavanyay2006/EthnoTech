class SavingsAccount extends Bankaccount{
    SavingsAccount(String name,double balance){
        super(name,balance);
    }
    
    public void withdraw(double amount){
        if (balance - amount < 0){
            System.out.println("Insufficient funds");
        } else {
            super.withdraw(amount);
        }
    }
    
}