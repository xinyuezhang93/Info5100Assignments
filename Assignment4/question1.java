package Assignment4;

public class question1 {
	
	public static int firstUniqChar(String s) {
        if ("".equals(s)) {
            return -1;
        }
        char[] st = s.toCharArray();
        int[] frequency = new int[26];
        for(char ch : st){
            frequency[(int)ch - 97] += 1;
        }
        for (int i = 0; i < st.length; i++){
            if (frequency[(int)st[i] - 97] == 1){
                return(i); 
            }
        }
        return(-1);
    }
	
	public static void main(String arg[]) {
		String input = "leetcode";
		int output = firstUniqChar(input);
		System.out.println(output);
	}
}
