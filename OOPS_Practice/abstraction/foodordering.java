abstract class Foodorder{
    String customerName;
    int quantity;
    double price;
    Foodorder(){
        System.out.println("welcome to our ordering system");
    }
    Foodorder(String name,int quantity,double price){
        this.customerName=name;
        this.quantity=quantity;
        this.price=price;
    }
    abstract void orderFood();
    void generateBill(){
        double total=quantity*price;
        System.out.println("customer name: "+customerName);
        System.out.println("Quantity:"+quantity);
        System.out.println("price per item"+price);
        System.out.println("total amount:"+total);
    }
    public double discount(){
        return price*0.05;
    }

}
class pizzaorder extends Foodorder{
    pizzaorder(String name,int quantity,double price){
        super(name,quantity,price);
    }
    void orderFood(){
        System.out.println("pizza ordered");
    }
    @Override
    public double discount(){
        return super.discount();
    }
}
class foodordering{
    public static void main(String[] args) {
        pizzaorder obj=new pizzaorder("sneha",2,100);
        obj.orderFood();
        obj.generateBill();
        System.out.println("discount "+obj.discount());
    }
}

