package Assignment5;

import java.util.StringJoiner;
import java.util.Vector;
// Maintains a list of DessertItem references There is no limit to the number of DessertItem's in the list
public class Checkout {
    Vector<DessertItem> items;

    // Creates a Checkout instance with an empty list of DessertItem's
    public Checkout() {
        items = new Vector<DessertItem>();
    }
//Returns the number of DessertItem's in the list
    public int numberOfItems() {
        return items.size();
    }
//A DessertItem is added to the end of the list of items
    public void enterItem(DessertItem item) {
        items.add(item);
    }
//Clears the Checkout to begin checking out a new set of items
    public void clear() {
        items.clear();
    }
//Returns total cost of items in cents (without tax)
    public int totalCost() {
        int cost = 0;
        for (DessertItem d : items) {
            cost += d.getCost();
        }
        return cost;
    }
//Returns total tax on items in cents
    public int totalTax() {
        return (int) Math.round(DessertShoppe.TAX_RATE * totalCost());
    }
//Returns a String representing a receipt for the current list of items
    @Override
    public String toString() {
        StringJoiner receipt = new StringJoiner("\n");
        receipt.add("         M & M Dessert Shoppe         ");
        receipt.add("         --------------------         ");
        for (DessertItem item : items) {
            if (item instanceof Candy) {
                receipt.add(((Candy)item).weightAndPrice());
            }
            if (item instanceof Cookie) {
                receipt.add(((Cookie)item).numberAndPrice());
            }
            String cost = String.format("%" + DessertShoppe.DISPLAY_WIDTH + "s", DessertShoppe.cents2dollarsAndCents(item.getCost()));
            receipt.add(item.getName() + " " + cost);
        }
        receipt.add("");
        String taxString = String.format("%-" + DessertShoppe.MAX_SIZE_OF_NAME + "s", "Tax");
        String taxAmount = String.format("%" + DessertShoppe.DISPLAY_WIDTH + "s", DessertShoppe.cents2dollarsAndCents(totalTax()));
        receipt.add(taxString + " " + taxAmount);
        String costString = String.format("%-" + DessertShoppe.MAX_SIZE_OF_NAME + "s", "Total Cost");
        String costAmount = String.format("%" + DessertShoppe.DISPLAY_WIDTH + "s", DessertShoppe.cents2dollarsAndCents(totalCost() + totalTax()));
        receipt.add(costString + " " + costAmount);
        return receipt.toString();
    }

}
