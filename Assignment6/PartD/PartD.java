package Assignment6;

public class PartD {

	public static int findClosest(int A[], int target) {
		if (A == null || A.length == 0) {
			throw new IllegalArgumentException("Null/Empty Array given");
		}
		
		if (target <= A[0]){
			return 0;
		}
		
		if (target >= A[A.length - 1]) {
			return A.length - 1;
		}
		
		for (int i = 1; i < A.length; i++) {
			if (target == A[i]) {
				return i;
			} else if (target < A[i]) {
				return A[i] - target > target - A[i-1] ? i-1: i;
			}
		}
		throw new IllegalArgumentException("Input Invalid");
		// will not end at this line due to the validity of input.
	}
	
	public static void main(String[] args) {
		
		int[] A = {1,2,4,6,7,7,16};
		
		System.out.println(findClosest(A, 0));
		System.out.println(findClosest(A, 7));
		System.out.println(findClosest(A, 10));
		System.out.println(findClosest(A, 18));
		System.out.println(findClosest(A, 15));
		System.out.println(findClosest(null, 0));
	}
	
	
	
}
