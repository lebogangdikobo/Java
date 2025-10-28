import java.util.ArrayList;
import java.util.Scanner;
public class GroceryCalculator{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        ArrayList<String> items = new ArrayList<>();
        ArrayList<Integer> quantities = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();

        System.out.println("===Groccery Calculator===");

        System.out.print("Enter name of the item (or enter \'done\' to finish'): ");
        String item = scan.nextLine();

        while(!item.equalsIgnoreCase("done")){
            System.out.print("Enter quantity for " + item + ": ");
            int quantity = Integer.parseInt(scan.nextLine());

            System.out.print("Enter the price: R");
            double price = Double.parseDouble(scan.nextLine());

            items.add(item);
            quantities.add(quantity);
            prices.add(price);

            System.out.print("Enter name of the item (or enter \'done\' to finish'): ");
            item = scan.nextLine();
        }

        System.out.println("===Grocery Summary===");
        double grandTotal = 0;

        for(int i = 0; i < items.size(); i++){
            double total = quantities.get(i) * prices.get(i);

            System.out.println(items.get(i) + "\tQty: " + quantities.get(i) + "\tPrice: R" + prices.get(i) + "\tTotal: R" + total);

            grandTotal += total;
        }

        System.out.println("\nGrand total: R" + grandTotal);

        scan.close();
    }
}