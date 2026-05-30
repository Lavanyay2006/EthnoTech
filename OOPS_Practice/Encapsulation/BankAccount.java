class BankAccount{
    private double balance;
    private String name;
    BankAccount(String name,double balance){
        this.name=name;
        this.balance=balance;
    }
     public void setBalance(double balance)
    {
        this.balance=balance;
    }
    public double getBalance()
    {
        return balance;
    }
    public static void main(String[] args) {
        BankAccount b1=new BankAccount("sneha",5000);
        b1.setBalance(6000);
        System.out.println(b1.getBalance());
    }  
}