import java.util.*;

abstract class Foodorder {

    String customername;
    String Address;

    Foodorder() {
        System.out.println("Welcome");
    }

    Foodorder(String name, String add) {

        this.customername = name;
        this.Address = add;
    }

    abstract void order();

    void display() {

        System.out.println("Customer Name : " + customername);
        System.out.println("Address : " + Address);
    }
}

class Biryani extends Foodorder {

    Biryani(String name, String add) {
        super(name, add);
    }

    int item_no = 1;
    double price = 100;
    int quantity = 2;

    String Fooditem = "Biryani";

    @Override
    void display() {

        super.display();

        double total = price * quantity;
        double discount = total / 1.5;

        System.out.println("Item Number : " + item_no);
        System.out.println("Item Name : " + Fooditem);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price : " + price);
        System.out.println("After Discount : " + discount);
    }

    @Override
    void order() {

        System.out.println("Order Placed Successfully");
    }
}

class Idly extends Foodorder {

    Idly(String name, String add) {
        super(name, add);
    }

    int item_no = 2;
    double price = 40;
    int quantity = 3;

    String Fooditem = "Idly";

    @Override
    void display() {

        super.display();

        double total = price * quantity;
        double discount = total / 1.5;

        System.out.println("Item Number : " + item_no);
        System.out.println("Item Name : " + Fooditem);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price : " + price);
        System.out.println("After Discount : " + discount);
    }

    @Override
    void order() {

        System.out.println("Order Placed Successfully");
    }
}

class Chapathi extends Foodorder {

    Chapathi(String name, String add) {
        super(name, add);
    }

    int item_no = 3;
    double price = 40;
    int quantity = 1;

    String Fooditem = "Chapathi";

    @Override
    void display() {

        super.display();

        double total = price * quantity;
        double discount = total / 1.5;

        System.out.println("Item Number : " + item_no);
        System.out.println("Item Name : " + Fooditem);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price : " + price);
        System.out.println("After Discount : " + discount);
    }

    @Override
    void order() {

        System.out.println("Order Placed Successfully");
    }
}

class Puri extends Foodorder {

    Puri(String name, String add) {
        super(name, add);
    }

    int item_no = 4;
    double price = 20;
    int quantity = 2;

    String Fooditem = "Puri";

    @Override
    void display() {

        super.display();

        double total = price * quantity;
        double discount = total / 1.5;

        System.out.println("Item Number : " + item_no);
        System.out.println("Item Name : " + Fooditem);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price : " + price);
        System.out.println("After Discount : " + discount);
    }

    @Override
    void order() {

        System.out.println("Order Placed Successfully");
    }
}

class Maggie extends Foodorder {

    Maggie(String name, String add) {
        super(name, add);
    }

    int item_no = 5;
    double price = 25;
    int quantity = 1;

    String Fooditem = "Maggie";

    @Override
    void display() {

        super.display();

        double total = price * quantity;
        double discount = total / 1.5;

        System.out.println("Item Number : " + item_no);
        System.out.println("Item Name : " + Fooditem);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price : " + price);
        System.out.println("After Discount : " + discount);
    }

    @Override
    void order() {

        System.out.println("Order Placed Successfully");
    }
}

class Eggrice extends Foodorder {

    Eggrice(String name, String add) {
        super(name, add);
    }

    int item_no = 6;
    double price = 60;
    int quantity = 5;

    String Fooditem = "Eggrice";

    @Override
    void display() {

        super.display();

        double total = price * quantity;
        double discount = total / 1.5;

        System.out.println("Item Number : " + item_no);
        System.out.println("Item Name : " + Fooditem);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price : " + price);
        System.out.println("After Discount : " + discount);
    }

    @Override
    void order() {

        System.out.println("Order Placed Successfully");
    }
}

class Paneer extends Foodorder {

    Paneer(String name, String add) {
        super(name, add);
    }

    int item_no = 7;
    double price = 99;
    int quantity = 2;

    String Fooditem = "Paneer";

    @Override
    void display() {

        super.display();

        double total = price * quantity;
        double discount = total / 1.5;

        System.out.println("Item Number : " + item_no);
        System.out.println("Item Name : " + Fooditem);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price : " + price);
        System.out.println("After Discount : " + discount);
    }

    @Override
    void order() {

        System.out.println("Order Placed Successfully");
    }
}

class Burger extends Foodorder {

    Burger(String name, String add) {
        super(name, add);
    }

    int item_no = 8;
    double price = 89;
    int quantity = 3;

    String Fooditem = "Burger";

    @Override
    void display() {

        super.display();

        double total = price * quantity;
        double discount = total / 1.5;

        System.out.println("Item Number : " + item_no);
        System.out.println("Item Name : " + Fooditem);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price : " + price);
        System.out.println("After Discount : " + discount);
    }

    @Override
    void order() {

        System.out.println("Order Placed Successfully");
    }
}

class Palav extends Foodorder {

    Palav(String name, String add) {
        super(name, add);
    }

    int item_no = 9;
    double price = 60;
    int quantity = 1;

    String Fooditem = "Palav";

    @Override
    void display() {

        super.display();

        double total = price * quantity;
        double discount = total / 1.5;

        System.out.println("Item Number : " + item_no);
        System.out.println("Item Name : " + Fooditem);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price : " + price);
        System.out.println("After Discount : " + discount);
    }

    @Override
    void order() {

        System.out.println("Order Placed Successfully");
    }
}

class Icecream extends Foodorder {

    Icecream(String name, String add) {
        super(name, add);
    }

    int item_no = 10;
    double price = 55;
    int quantity = 2;

    String Fooditem = "Icecream";

    @Override
    void display() {

        super.display();

        double total = price * quantity;
        double discount = total / 1.5;

        System.out.println("Item Number : " + item_no);
        System.out.println("Item Name : " + Fooditem);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price : " + price);
        System.out.println("After Discount : " + discount);
    }

    @Override
    void order() {

        System.out.println("Order Placed Successfully");
    }
}

class Demo {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("------------ Items List ---------");

        System.out.println("1. Biryani");
        System.out.println("2. Idly");
        System.out.println("3. Chapathi");
        System.out.println("4. Puri");
        System.out.println("5. Maggie");
        System.out.println("6. Eggrice");
        System.out.println("7. Paneer");
        System.out.println("8. Burger");
        System.out.println("9. Palav");
        System.out.println("10. Icecream");

        System.out.print("Enter Item Number : ");

        int item_no = sc.nextInt();

        if(item_no == 1) {

            Biryani b = new Biryani("Navya", "Puttaparthi");
            b.display();
            b.order();
        }

        else if(item_no == 2) {

            Idly i = new Idly("Nani", "Bangalore");
            i.display();
            i.order();
        }

        else if(item_no == 3) {

            Chapathi c = new Chapathi("Nandhu", "Tamil Nadu");
            c.display();
            c.order();
        }

        else if(item_no == 4) {

            Puri p = new Puri("Nithya", "Kerala");
            p.display();
            p.order();
        }

        else if(item_no == 5) {

            Maggie m = new Maggie("Ram", "Hyderabad");
            m.display();
            m.order();
        }

        else if(item_no == 6) {

            Eggrice e = new Eggrice("Kiran", "Chennai");
            e.display();
            e.order();
        }

        else if(item_no == 7) {

            Paneer p = new Paneer("Divya", "Delhi");
            p.display();
            p.order();
        }

        else if(item_no == 8) {

            Burger b = new Burger("Sita", "Mumbai");
            b.display();
            b.order();
        }

        else if(item_no == 9) {

            Palav p = new Palav("Ravi", "Pune");
            p.display();
            p.order();
        }

        else if(item_no == 10) {

            Icecream i = new Icecream("Anu", "Goa");
            i.display();
            i.order();
        }

        else {

            System.out.println("Item Not Found!!!");
        }
    }
}