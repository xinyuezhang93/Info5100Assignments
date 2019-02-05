package Assignment4;

public class question2 {
//	math --> O(1)
    public static int addDigits(int num) {
        if (num == 0){
            return 0;
        }
        return (num % 9 == 0 ? 9 : num % 9);
    }
    
    public static void main(String arg[]) {
		int input = 38;
		int output = addDigits(input);
		System.out.println(output);
	}
}