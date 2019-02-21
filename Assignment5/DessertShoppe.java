package Assignment5;

public class DessertShoppe {
	
	public static final String STORE_NAME = "assignment5";
    public static final double TAX_RATE = 0.065;
    public static final int MAX_SIZE_OF_NAME = 30;  
    public static final int DISPLAY_WIDTH = 7;
    
    public static String cents2dollarsAndCents(int cents){
        return String.format("%.2f", cents/100.0);
    }

//
//    public static void main(String[] args) {
//        System.out.println(cents2dollarsAndCents(105));
//    }
}


