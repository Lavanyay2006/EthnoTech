class Bank{
    public static void main(String[] args) {
        Bankaccount b1=new Bankaccount("sneha",5000);
        b1.deposit(2000);
        b1.withdraw(3000);
        System.out.println(b1.getBalance());
        SavingsAccount s1=new SavingsAccount("sneha",1000);
        s1.withdraw(500);
        System.out.println(s1.getBalance());
    }
}