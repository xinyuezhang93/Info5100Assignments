package Assignment5;

public class Sundae extends IceCream {
    private int topping_cost;

    public Sundae(String name, int cost, String topping_name, int topping_cost){
        super(topping_name + " Sundae with\n" + String.format("%-" + DessertShoppe.MAX_SIZE_OF_NAME + "s", name), cost);
        this.topping_cost = topping_cost;
    }

    @Override
    public int getCost() {
        return super.getCost() + topping_cost;
    }

}