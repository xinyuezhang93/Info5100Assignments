package Assignment5;

public class Cookie extends DessertItem {
    private int number;
    private int price;

    public Cookie(String name, int number, int price) {
        super(name);
        this.number = number; //12 per dozen
        this.price = price; //per dozen
    }

    @Override
    public int getCost() {
        return (int) Math.round(number * price / 12.0);
    }

    public String numberAndPrice(){
        return number + " @ " + DessertShoppe.cents2dollarsAndCents(price) + " /dz.";
    }
}