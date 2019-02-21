package Assignment5;

public abstract class DessertItem {
	protected String name;
// Null constructor for DessertItem class
    public DessertItem() {
    }
// Initialise DessertItem data
    public DessertItem(String name) {
        this.name = String.format("%-" + DessertShoppe.MAX_SIZE_OF_NAME + "s", name);
    }
// Returns name of DessertItem
    public final String getName() {
        return name;
    }
// Returns cost of DessertItem
    public abstract int getCost();
}
