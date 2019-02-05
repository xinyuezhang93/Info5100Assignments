package Assignment4;

public class question4 {
//     Manacher's algorithm --> O(n) / space & time
    public static String longestPalindrome(String s) {
        int n = s.length();
        if (n == 0){
            return "";
        }
        int[] odd = new int[n];
        for(int i = 0, l = 0, r = -1; i < n; i++){
            int k = (i<r ? Math.min(r-i, odd[l+r-i]):1);
            while (0 <= i-k && i+k < n && s.charAt(i-k) == s.charAt(i+k)){
                k++;
            }
            odd[i] = k--;
            if (i+k > r){
                r = i + k;
                l = i - k;
            }
        }
        int[] even = new int[n];
        for(int i = 0, l = 0, r = -1; i < n; i++){
            int k = (i<r ? Math.min(r-i+1, even[l+r-i+1]):0);
            while (0 <= i-k-1 && i+k < n && s.charAt(i-k-1) == s.charAt(i+k)){
                k++;
            }
            even[i] = k--;
            if (i+k > r){
                r = i + k;
                l = i - k - 1;
            }
        }
        String res1 = "";
        String res2 = "";
        int ans1 = 0;
        int ans2 = 0;
        for (int i = 0; i < n; i++){
            if (odd[i] > ans1){
                ans1 = odd[i];
                res1 = s.substring(i-ans1+1, i+ans1);
            }
            if (even[i] > ans2){
                ans2 = even[i];
                res2 = s.substring(i-ans2, i+ans2);
            }
        }
        return(ans1*2-1 > ans2*2 ? res1:res2);
    }
    
    public static void main(String arg[]) {
		String input = "babad";
		String output = longestPalindrome(input);
		System.out.print(output);	
	}
}





