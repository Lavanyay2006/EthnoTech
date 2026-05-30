import java.util.Scanner;
public class TemperatureAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] temp = new int[30];
        int high, low;
        double average;
        int sum = 0;
        int hotDays = 0;
        System.out.println("Enter temperature for 30 days:");
       for (int i = 0; i < 30; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            temp[i] = sc.nextInt();
        }
        high = temp[0];
        low = temp[0];
        for (int i = 0; i < 30; i++) {
            if (temp[i] > high) {
                high = temp[i];
            }
            if (temp[i] < low) {
                low = temp[i];
            }
            sum += temp[i];
            if (temp[i] > 35) {
                hotDays++;
            }
        }
        average = (double) sum / 30;
        System.out.println("\nHighest Temperature : " + high + "°C");
        System.out.println("Lowest Temperature  : " + low + "°C");
        System.out.println("Average Temperature : " + average + "°C");
        System.out.println("Number of Hot Days (>35°C) : " + hotDays);

        sc.close();
    }
}