class User {
    void Booking(){
        System.out.println("Ride booking started");
    }
    
}
class Auto extends User{
    @Override
    void Booking()
    {
        double fair=180;
        System.out.println("Fair of Auto per 2KM: "+fair);

    }
}
class Bike extends User{
    @Override
    void Booking(){
        double fair=120;
        System.out.println("Fair of Bike ride per 2KM: "+fair);
    }
}
class Cab extends User{
    @Override
    void Booking(){
        double fair=250;
        System.out.println("Fair of cab ride per 2KM: "+fair);

    }
}
public class RideBookingSystem{
    public static void main(String[] args) {
        Auto a=new Auto();
        a.Booking();
        Bike b=new Bike();
        b.Booking();
        Cab c=new Cab();
        c.Booking();
        
    }
}