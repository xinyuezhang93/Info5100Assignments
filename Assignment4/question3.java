package Assignment4;

import java.util.Arrays;

public class question3 {
	public static int[] moveZeroes(int[] nums) {
        int slow = 0;
        int fast = 0;
        for (int num: nums){
            if (num != 0){
                if (slow < fast){
                    nums[fast] = 0;
                    nums[slow] = num;
                }
                slow += 1;
            }
            fast += 1;
        }
        return nums;
    }
	
	public static void main(String arg[]) {
		int[] input = {0,1,0,3,12};
		int[] output = moveZeroes(input);
		System.out.print(Arrays.toString(output));	
	}
}
