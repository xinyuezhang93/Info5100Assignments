
public class TestQ2 {

	public static void main(String[] args) {
		
		HappyObject happy = new HappyObject();
		SadObject sad = new SadObject();
		
		PsychiatristObject psychiatrist = new PsychiatristObject();
		
		psychiatrist.examine(happy);
		psychiatrist.observe(happy);
		
		psychiatrist.examine(sad);
		psychiatrist.observe(sad);
		
		
	}
	
}
