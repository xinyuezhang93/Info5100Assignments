
public class Question3 {
	
	public static String reverse(String s) {
		
		String ans = null;
		String[] arrOfS = s.split(" "); 
		
        for (int i = arrOfS.length-1; i >= 0; i--) {
        	if (!arrOfS[i].isEmpty()) {
        		if (ans == null){
        			ans = arrOfS[i];
        		} else {
        		ans = ans + " " + arrOfS[i];
        		}
        	}
        }
       	return ans;    
    } 
		
	public static void main(String[] args) {
		String s = " This  is a pig";
		System.out.println(" Input:" + s);
		System.out.println("Output:" + reverse(s));
	}	
}
