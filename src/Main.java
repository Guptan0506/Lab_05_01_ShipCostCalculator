import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What's the price of the item?");
        double shipCost = 0;
        double totalCost = 0;
        double itemCost = 0;
        itemCost= in.nextDouble();
        if (itemCost > 100) {
            System.out.println("Your total cost is "+ itemCost);
        }
        else {
            shipCost = 0.02 * itemCost;
            totalCost = itemCost + shipCost;
            System.out.println("Your shipping cost is "+ shipCost + " and your total cost is "+ totalCost);
        }
    }
}