class Bankaccount{
    double balance;
    String name;
    Bankaccount(String name,double balance){
        this.name=name;
        this.balance=balance;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        if(amount>balance){
            System.out.print("Insufficient funds");
        }
        else{
            balance-=amount;
        }
    }
    public double getBalance(){
       return balance;
    }
}