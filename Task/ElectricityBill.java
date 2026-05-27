import java.util.Scanner;
public class ElectricityBill
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
int units;
int bill = 0;
System.out.print("Enter electricity units: ");
units = sc.nextInt();
if ((units > 250) & (units <= 300))
{
bill = 50;
} 
else if (units <= 250) 
{
bill = 0;
} 
else
{
bill = (units - 300) * 5 + 50;
}
System.out.println("Electricity Bill = " + bill + " rupees");
sc.close();
    }
}